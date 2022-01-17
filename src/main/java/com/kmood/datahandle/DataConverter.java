package com.kmood.datahandle;

import com.kmood.utils.JsonBinder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;


public class DataConverter {
    public static Object convert(Object obj,Config conf){

        GsonBuilder g = new GsonBuilder();
        GsonBuilder gsonBuilder = g.serializeNulls();
        if (conf != null){
            HashMap<String, DataHandler> keyConfMap = conf.getKeyConfMap();
            HashMap<String, String> keyGlobalConfrMap = conf.getKeyGlobalConfrMap();
            if (keyGlobalConfrMap !=null && keyGlobalConfrMap.containsKey(GlobalConfItemEnum.D_F)){
                gsonBuilder.setDateFormat(keyGlobalConfrMap.get(GlobalConfItemEnum.D_F));
                gsonBuilder.registerTypeAdapter(
                        new TypeToken<HashMap<String, Object>>() {
                        }.getType(), new TypeAdapter<Object>() {
                            @Override
                            public void write(JsonWriter out, Object value) throws IOException {
                                write(out, value);
                            }

                            @Override
                            public Object read(JsonReader in) throws IOException {
                                JsonToken token = in.peek();
                                String ActPath = in.getPath();
                                String path = ActPath.replaceAll("\\$\\.","");
                                String path_ = path.replaceAll("\\[[0-9]{1,}]", "*").replaceAll("\\$\\.","");
                                switch (token) {
                                    case BEGIN_ARRAY:
                                        List<Object> list = new ArrayList<Object>();
                                        in.beginArray();
                                        while (in.hasNext()) {
                                            list.add(read(in));
                                        }
                                        in.endArray();
                                        if(keyConfMap !=null && keyConfMap.containsKey(path)) return keyConfMap.get(path).ObjHandle(list);
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path_)) return keyConfMap.get(path_).ObjHandle(list);
                                        return list;
                                    case BEGIN_OBJECT:
                                        Map<String, Object> map = new HashMap<String, Object>();
                                        in.beginObject();
                                        while (in.hasNext()) {
                                            map.put(in.nextName(), read(in));
                                        }
                                        in.endObject();
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path)) return keyConfMap.get(path).ObjHandle(map);
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path_)) return keyConfMap.get(path_).ObjHandle(map);
                                        return map;
                                    case STRING:
                                        String s = in.nextString();
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path)) return keyConfMap.get(path).ObjHandle(s);
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path_)) return keyConfMap.get(path_).ObjHandle(s);
                                        return s;
                                    case NUMBER:
                                        /**
                                         * 改写数字的处理逻辑，将数字值分为整型与浮点型。
                                         */

                                        double dbNum = in.nextDouble();
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path)) return keyConfMap.get(path).ObjHandle(dbNum);
                                        if(keyConfMap !=null &&keyConfMap.containsKey(path_)) return keyConfMap.get(path_).ObjHandle(dbNum);
                                        // 数字超过long的最大值，返回浮点类型
                                        if (dbNum > Long.MAX_VALUE) {
                                            return dbNum;
                                        }
                                        // 判断数字是否为整数值
                                        long lngNum = (long) dbNum;
                                        if (dbNum == lngNum) {
                                            return lngNum;
                                        } else {
                                            return dbNum;
                                        }
                                    case BOOLEAN:
                                        return in.nextBoolean();
                                    case NULL:
                                        in.nextNull();
                                        if(keyConfMap !=null && keyConfMap.containsKey(path)) return keyConfMap.get(path).ObjHandle(null);
                                        if(keyConfMap !=null && keyConfMap.containsKey(path_)) return keyConfMap.get(path_).ObjHandle(null);
                                        return null;
                                    default:
                                        throw new IllegalStateException();
                                }
                            }
                        }
                );
            }
        }
        Gson gson = gsonBuilder.create();
        String s = gson.toJson(obj);
        s = s.replaceAll("\\\\u0026", "&amp;").replaceAll("\\\\u003c", "&lt;").replaceAll("\\\\u003e", "&gt;");
        Object o = gson.fromJson(s, new TypeToken<HashMap<String, Object>>() {
        }.getType());
        return o;
    }


    // 循环数据增加序号，导出图片使用。   {arr:[{id:"第一个"},{id:"第2个"}]} => {arr:[{id:"第一个",_xh:"-1"},{id:"第2个",_xh:"-2"}]}
    public static Object addPictureXh(Object obj,String index){
        HashMap renderData= (HashMap) obj;
        Set<String> sets = renderData.keySet();
        for(Object key :sets){ // 这块应该使用递归，获取所有的图片并输出
            Object objMap=  renderData.get(key);
            if(objMap.getClass().equals(ArrayList.class)){
                ArrayList<HashMap> arrList=(ArrayList)objMap;
                int i=0;
                for(HashMap mapItem :arrList){
                    i++;
                    mapItem.put("_xh",index+"-"+i);
                    addPictureXh(mapItem,index+"-"+i);
                }
            }
        }
        return obj;
    }

}

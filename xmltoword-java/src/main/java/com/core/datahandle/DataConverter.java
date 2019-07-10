package com.core.datahandle;

import com.core.utils.JsonBinder;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: SunBC
 * @Date: 2019/7/10 13:06
 * @Description:
 */
public class DataConverter {
    public void convert(Object obj,Config conf){
        HashMap<String, DataHandler> keyConfMap = conf.getKeyConfMap();
        HashMap<String, String> keyGlobalConfrMap = conf.getKeyGlobalConfrMap();
        GsonBuilder g = new GsonBuilder();
        GsonBuilder gsonBuilder = g.serializeNulls();
        if (keyGlobalConfrMap.containsKey(GlobalConfItemEnum.D_F))
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
                        String path = in.getPath();
                        String path_ = path.replaceAll("\\[[0-9]{1,}]", "*");
                        switch (token) {
                            case BEGIN_ARRAY:
                                List<Object> list = new ArrayList<Object>();
                                in.beginArray();
                                while (in.hasNext()) {
                                    list.add(read(in));
                                }
                                in.endArray();
                                return list;
                            case BEGIN_OBJECT:
                                Map<String, Object> map = new HashMap<String, Object>();
                                in.beginObject();
                                while (in.hasNext()) {
                                    map.put(in.nextName(), read(in));
                                }
                                in.endObject();
                                return map;
                            case STRING:
                                return in.nextString();
                            case NUMBER:
                                /**
                                 * 改写数字的处理逻辑，将数字值分为整型与浮点型。
                                 */
                                double dbNum = in.nextDouble();

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
                                return null;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                }
        );


    }

}

package com.core.utils;

import com.google.gson.Gson;
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

public class JsonBinder {
    private Gson gson;
    private JsonBinder() {
        gson = new Gson();
    }

    //创建一个指定日期格式，字段为null时原样输出该字段的gson对象
    public static Gson buildNormalBinder(String sdf) {
        return new GsonBuilder().serializeSpecialFloatingPointValues().setDateFormat(sdf).serializeNulls().create();
    }
    //创建一个指定类型适配器的gson对象
    public static Gson buildNormalBinderAndHandlerMap(String sdf) {
        return new GsonBuilder().serializeSpecialFloatingPointValues()
                .registerTypeAdapter(
                        new TypeToken<HashMap<String,Object>>() {}.getType(), new MapTypeAdapter()
                )
                .setDateFormat(sdf).serializeNulls().create();
    }

    //创建一个默认的gson
    public Gson getGson() {
        return gson;
    }


    /**
     *
     * @ClassName MapTypeAdapter
     * @Description TODO
     * @author sunBC
     * @date 2018年8月30日
     * @version V1.0
     */
    public static class MapTypeAdapter extends TypeAdapter<Object> {
        @Override
        public Object read(JsonReader in) throws IOException {
            JsonToken token = in.peek();
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

        @Override
        public void write(JsonWriter out, Object value) throws IOException {
            // 序列化无需实现
            write(out, value);
        }

    }


}

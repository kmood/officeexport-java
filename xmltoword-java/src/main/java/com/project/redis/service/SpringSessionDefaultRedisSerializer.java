package com.project.redis.service;

import hprose.io.ByteBufferStream;
import hprose.io.HproseFormatter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Auther: SunBC
 * @Date: 2019/3/4 10:00
 * @Description:
 */
//@Component
public class SpringSessionDefaultRedisSerializer implements RedisSerializer {

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        ByteBufferStream serialize = null;
        try {
            serialize = HproseFormatter.serialize(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return serialize.toArray();
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        try {
            HproseFormatter.unserialize(ByteBufferStream.wrap(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.example.demo.config;

import io.lettuce.core.codec.RedisCodec;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public class CustomCodec implements RedisCodec<String, byte[]> {

    private static final byte[] EMPTY = new byte[0];
    private final Charset charset = Charset.forName("UTF-8");

    @Override
    public String decodeKey(ByteBuffer byteBuffer) {
        return charset.decode(byteBuffer).toString();
    }

    @Override
    public byte[] decodeValue(ByteBuffer byteBuffer) {
        return getBytes(byteBuffer);
    }

    @Override
    public ByteBuffer encodeKey(String key) {
        return charset.encode(key);
    }

    @Override
    public ByteBuffer encodeValue(byte[] bytes) {
        return ByteBuffer.wrap(Objects.requireNonNullElse(bytes, EMPTY));
    }

    private byte[] getBytes(ByteBuffer byteBuffer) {
        byte[] bytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(bytes);
        return bytes;
    }
}

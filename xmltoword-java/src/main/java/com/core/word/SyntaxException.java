package com.core.word;

public class SyntaxException extends RuntimeException {
    public SyntaxException(String message) {
        super("模板占位符格式错误："+message);
    }
}

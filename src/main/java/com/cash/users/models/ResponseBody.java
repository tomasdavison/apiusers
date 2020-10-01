package com.cash.users.models;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
public class ResponseBody<T> {
    private boolean hasError;
    private List<String> errors;
    private T data;

    private ResponseBody(T data) {
        this.hasError = false;
        this.errors = Collections.emptyList();
        this.data = data;
    }

    private ResponseBody(List<String> errors, T data) {
        this.errors = errors;
        this.data = data;
    }

    public static <T> ResponseBody<T> ok(T data) { return new ResponseBody<>(data); }
    public static <T> ResponseBody<T> notOk(List<String> errors) { return new ResponseBody<>(errors, null); }
}

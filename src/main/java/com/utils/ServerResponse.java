package com.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> {
    //0表示成功，-1表示逻辑处理失败，-2表示身份验证失败
    private int code;
    //数据
    private T data;
    //信息
    private T dataPlus;

    private String msg;

    public ServerResponse() {
        super();
    }

    public ServerResponse(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public ServerResponse(int code, T data, String msg) {
        super();
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public ServerResponse(int code, T data, T dataPlus, String msg) {
        super();
        this.code = code;
        this.data = data;
        this.dataPlus = dataPlus;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getDataPlus() { return dataPlus; }

    public void setDataPlus(T dataPlus) { this.dataPlus = dataPlus;}

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

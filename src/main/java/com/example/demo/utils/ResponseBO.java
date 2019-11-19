package com.example.demo.utils;

import java.io.Serializable;

/**
 * 响应数据结构
 * @Author:Goffy
 */
public class ResponseBO<T> implements Serializable {
    public static final int ERROR =0;
    public static final int SUCCESS =0;

    private Integer completeCode;

    private String  reasonCode;

    private String reasonMessage;

    private T data;

    private ResponseBO(Builder<T> builder) {
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.completeCode = builder.completeCode;
        this.data = builder.data;
    }
    public Integer getCompleteCode() {
        return completeCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public T getData() {
        return data;
    }

    /**
     * @Deprecated 代表此方法已经过期，不建议使用。调用时会出现删除线，但并不是不能用。
     */
    @Deprecated
    public ResponseBO<T> setCompleteCode(Integer completeCode){
        this.completeCode = completeCode;
        return this;
    }

    @Deprecated
    public ResponseBO<T> setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    @Deprecated
    public ResponseBO<T> setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    @Deprecated
    public ResponseBO<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResponseBO{" +
                "completeCode=" + completeCode +
                ", reasonCode='" + reasonCode + '\'' +
                ", reasonMessage='" + reasonMessage + '\'' +
                ", data=" + (data == null ? "null" : data.toString()) +
                '}';
    }

    public static ResponseBO responseFail(String s) {
        return ResponseBO.Builder.init().setFailMessage(s).build();
    }

    public static ResponseBO responseOK() {
        return ResponseBO.Builder.init().build();
    }

    public static class Builder<K>{
        private Integer completeCode;

        private String reasonCode;

        private String reasonMessage;

        private K data;

        private Builder(int completeCode){
            this.completeCode = completeCode;
        }

        static public <K> Builder<K> init() { return new Builder<>(SUCCESS); }
        public Builder<K> setCompleteCode(int code) {
            this.completeCode = code;
            return this;
        }
        public Builder<K> setReasonCode(String code) {
            this.reasonCode = code;
            return this;
        }

        public Builder<K> setReasonMessage(String msg) {
            this.reasonMessage = msg;
            return this;
        }

        public Builder<K> setFailMessage(String msg) {
            this.reasonMessage = msg;
            this.completeCode = ERROR;
            return this;
        }

        public Builder<K> setData(K k) {
            this.data = k;
            return this;
        }

        public ResponseBO<K> build() { return new ResponseBO<>(this); }
    }

}

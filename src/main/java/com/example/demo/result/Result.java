package com.example.demo.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:Goffy
 */
@Data
public class Result implements Serializable {
    private Integer code;
    private String message;
    private Object data;

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}

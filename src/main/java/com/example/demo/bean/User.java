package com.example.demo.bean;

/**
 * 用户pojo
 * @Author:Goffy
 */
public class User {
    /**
     * 主键Id
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户地址
     */
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

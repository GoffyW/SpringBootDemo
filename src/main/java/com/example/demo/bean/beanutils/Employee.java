package com.example.demo.bean.beanutils;

import lombok.Data;

/**
 * @Author:Goffy
 */
@Data
public class Employee {
    private String name;
    private Integer age;
    private String dept;

    public Employee(String name, Integer age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
}

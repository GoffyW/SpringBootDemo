package com.example.demo.bean;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 为了验证SpringBoot Validator
 * @Author:Goffy
 */
public class DemoValidatorEntity {

    @NotBlank
    @Length(min = 2,max = 10)
    private String name;

    @Min(1)
    private int age;

    @NotBlank
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

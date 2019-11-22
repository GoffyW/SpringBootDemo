package com.example.demo.controller;

import com.example.demo.bean.DemoValidatorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

/**
 * @Author:Goffy
 */
@RestController
public class DemoValidatorController {
    @Autowired
    private MessageSource messageSource;
    @RequestMapping("/validator")
    public String validator(@Valid DemoValidatorEntity demoValidatorEntity, BindingResult bindResult){
        if (bindResult.hasErrors()){
            StringBuffer buffer = new StringBuffer();
            /*获取错误字段集合*/
            List<FieldError> fieldErrors = bindResult.getFieldErrors();
            /*获取本地locale,zh_CN*/
            Locale locale = LocaleContextHolder.getLocale();
            /*遍历错误字段集合*/
            for (FieldError f:fieldErrors){
                String message = messageSource.getMessage(f, locale);
                buffer.append(f.getField()+":"+message);
            }
            return buffer.toString();
        }
        return "验证通过,姓名："+demoValidatorEntity.getName()+",年龄："+demoValidatorEntity.getAge()+",邮箱："+demoValidatorEntity.getEmail();
    }
}

package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常类
 * @Author:Goffy
 */
@ControllerAdvice
public class MyGlobalExceptionHandler {
    @ExceptionHandler(Error.class)
    public ModelAndView customException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",e.getMessage());
        modelAndView.setViewName("myexception");
        return modelAndView;
    }

}

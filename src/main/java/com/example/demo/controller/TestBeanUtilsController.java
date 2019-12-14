package com.example.demo.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.example.demo.bean.HqThsPark;
import com.example.demo.bean.Park;
import com.example.demo.bean.beanutils.Employee;
import com.example.demo.bean.beanutils.User;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @Author:Goffy
 */
public class TestBeanUtilsController {
    private static Logger logger = LoggerFactory.getLogger(TestBeanUtilsController.class);
    public static void main(String[] args) {
        Park park = new Park();
        HqThsPark hqThsPark = new HqThsPark();
        //System.out.println(park);
        //System.out.println(hqThsPark);
        //testBeanUtils();
        Employee employee = new Employee("jordan",46,"Bull");
        Employee employee1 = new Employee("kobe",43,"Lakers");
        List<User> outPut = new ArrayList<>();
        List<Employee> employees = Arrays.asList(employee,employee1);

    }

    /**
     * 对象属性拷贝
     * 将源对象的属性拷贝到目标对象
     * @param source 源对象
     * @param target 目标对象
     */
    public static void copyProperties(Object source,Object target){
        try {
            BeanUtils.copyProperties(source,target);
        } catch (BeansException e) {
            logger.error("BeanUtil property copy  failed :BeansException",e);
            e.printStackTrace();
        } catch (Exception e){
            logger.error("BeanUtil property copy failed:Exception",e);
            e.printStackTrace();
        }
    }

    /**
     * List集合之间的对象属性赋值
     * @param input 输入集合
     * @param clazz 输出集合类型
     * @param <E> 输入集合类型
     * @param <T> 输出集合类型
     * @return 返回集合
     */
    public static <E,T> List<T> converList2List(List<E> input,Class<T> clazz){
        List<T> output = Lists.newArrayList();
        if (CollectionUtils.isEmpty(output)){
            for (E source:input){
                T instantiate = BeanUtils.instantiate(clazz);
                BeanUtils.copyProperties(source,instantiate);
                output.add(instantiate);
            }
        }
        return output;
    }

    public static void testBeanUtils(){
        Employee employee = new Employee("jordan",46,"Bull");
        Employee employee1 = new Employee("kobe",43,"Lakers");
        User user = new User();
        BeanUtils.copyProperties(employee,user);
        System.out.println(user);
        System.out.println("----------分割线-------");
    }






}

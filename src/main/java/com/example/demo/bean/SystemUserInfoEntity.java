package com.example.demo.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author:Goffy
 */
@Entity
@Table(name = "system_user_info")
@Data
public class SystemUserInfoEntity {
    /**
     * 主键
     */
    @Column(name = "SUI_ID")
    @GeneratedValue
    @Id
    private Integer id;

    /**
     * 昵称
     */
    @Column(name = "SUI_NICK_NAME")
    private String nickName;

    /**
     * 登录名
     */
    @Column(name = "SUI_LOGIN_NAME")
    private String loginName;

    /**
     * 登陆密码
     */
    @Column(name = "SUI_LOGIN_PASSWORD")
    private String loginPassword;

}

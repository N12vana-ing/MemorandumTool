package com.zyk.module;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoginUserDTO extends BaseDTO {

    //id
    private long id;

    //用户名
    private String userName;

    //密码
    private String passWord;

    //手机号
    private String telephone;

    private String email;

    //标志-- 1、新建 2、更新 3、删除
    private int code;

    //创建时间
    private Date createTime;

    //最后更新时间
    private Date updateTime;

    private String testmergeby2021;

    private String s2020;
}

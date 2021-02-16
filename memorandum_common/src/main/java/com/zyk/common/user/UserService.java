package com.zyk.common.user;

import com.zyk.module.LoginUserDTO;

import java.util.Map;

public interface UserService {

    /**
     * 获取所有用户的用户名密码
     * 通过map形式返回
     * @return map 用户名 - 密码
     */
    Map<String, String> getUserNameAndPwd();

}

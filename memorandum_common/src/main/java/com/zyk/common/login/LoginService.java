package com.zyk.common.login;

import java.util.Map;

public interface LoginService {

    boolean loginMethod(String userName);

    /**
     * 直接获取当前用户名密码
     * @param userName 登陆用户名
     * @return map 用户名-密码
     */
    Map<String, String> checkPwdByName(String userName);
}

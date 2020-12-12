package com.zyk.dao.login;

import com.zyk.module.LoginUserDTO;

/**
 * @author zhouyuankai
 *
 * 登陆信息查看
 */
public interface LoginUserDao {

    /**
     *
     * @param userName 传入username查询对应用户信息
     * @return
     */
    LoginUserDTO selectUserByName(String userName);

}

package com.zyk.dao.login.impl;

import com.zyk.dao.login.LoginUserDao;
import com.zyk.dtomapping.UserMapper;
import com.zyk.module.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("loginUserDao")
public class LoginUserDaoImpl implements LoginUserDao {

    @Autowired
    UserMapper userMapper;

    public LoginUserDTO selectUserByName(String userName) {
        return userMapper.getUserInfoByName(userName);
    }
}

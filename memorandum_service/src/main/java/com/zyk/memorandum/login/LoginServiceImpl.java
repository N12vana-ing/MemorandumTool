package com.zyk.memorandum.login;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyk.common.login.LoginService;
import com.zyk.dao.login.LoginUserDao;
import com.zyk.module.LoginUserDTO;
import lombok.extern.java.Log;

import javax.annotation.Resource;

@Log
@Service(interfaceClass = LoginService.class)
@org.springframework.stereotype.Service
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginUserDao loginUserDao;

    public boolean loginMethod(String userName) {
        log.info("service "+userName);
        LoginUserDTO loginUserDTO = loginUserDao.selectUserByName(userName);
        log.info("get result is "+loginUserDTO.getUserName()+" || "+loginUserDTO.getPassWord());
        return false;
    }
}

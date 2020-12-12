package com.zyk.memorandum.login;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyk.common.login.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LoginService.class)
@Component
public class LoginServiceImpl implements LoginService {
    private static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);

    public boolean loginMethod(String userName, String passWord) {
        log.info("service "+userName+" || "+passWord);
        return false;
    }
}

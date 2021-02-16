package com.zyk.memorandum.user;

import com.zyk.common.user.UserService;
import com.zyk.dao.user.UserSessionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserSessionMapper userSessionMapper;

    @Override
    public Map<String, String> getUserNameAndPwd() {
        return userSessionMapper.getAllUserNameAndPwd();
    }
}

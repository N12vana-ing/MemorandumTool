package com.zyk.dtomapping;

import com.zyk.module.LoginUserDTO;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper {
     LoginUserDTO getUserInfoByName(String userName);

     Map<String, String> getAllUserNameAndPwd();
}

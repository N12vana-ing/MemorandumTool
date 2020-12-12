package com.zyk.dtomapping;

import com.zyk.module.LoginUserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
     LoginUserDTO getUserInfoByName(String userName);
}

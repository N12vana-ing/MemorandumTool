package com.zyk.dao.user;

import com.zyk.dtomapping.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository
public class UserSessionMapper extends SqlSessionDaoSupport {

    @Override
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public Map<String, String> getAllUserNameAndPwd(){
        UserResultHandler resultHandler = new UserResultHandler();
        this.getSqlSession().select(UserMapper.class.getName()+".getAllUserNameAndPwd", resultHandler);
        Map<String, String> results = resultHandler.getMapResults();
        return results;
    }

}

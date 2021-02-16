package com.zyk.batchUpdate;

import com.zyk.TestMainApplication;
import com.zyk.common.user.UserService;
import com.zyk.dtomapping.TestMapper;
import com.zyk.module.TestDTO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UpdateTest extends TestMainApplication {
    @Resource
    TestMapper testMapper;

    @Resource
    UserService userService;

    @Test
    public void batchUpdateTest(){
        TestDTO testDTO1 = new TestDTO();
        TestDTO testDTO2 = new TestDTO();
        testDTO1.setUserName("zhouyk");
        testDTO2.setUserName("zhouyk");
        testDTO1.setSex("1");
        testDTO2.setSex("1");
        testDTO1.setClassName("math");
        testDTO2.setClassName("chn");
        testDTO1.setDegree(11);
        testDTO2.setDegree(22);
        testDTO1.setHomeDesc("math is 11");
        testDTO2.setHomeDesc("chn is 22");

        List<TestDTO> list = new ArrayList<>();
        list.add(testDTO1);
        list.add(testDTO2);

        testMapper.batchUpdateTest(list);
    }

    @Test
    public void selectAllUserNamePwd(){
        Map<String, String> map = userService.getUserNameAndPwd();
        Set<Map.Entry<String, String>> set = map.entrySet();
        for(Map.Entry<String, String> entry : set){
            System.out.println(entry.getKey()+" || "+entry.getValue());
        }
    }
}

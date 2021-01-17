package com.zyk.dtomapping;

import com.zyk.module.TestDTO;

import java.util.List;

public interface TestMapper {
    void batchUpdateTest(List<TestDTO> testDTOList);
}

package com.zyk.module;

import lombok.Data;

@Data
public class TestDTO extends BaseDTO {
    private int id;

    private String userName;

    private String sex;

    private int degree;

    private String className;

    private String homeDesc;
}

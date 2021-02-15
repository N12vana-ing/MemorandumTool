package com.zyk.mainTest;

import java.util.ArrayList;
import java.util.List;

public class MainMethodTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}

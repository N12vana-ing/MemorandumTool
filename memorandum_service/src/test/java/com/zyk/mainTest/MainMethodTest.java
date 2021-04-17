package com.zyk.mainTest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainMethodTest {
    public static void main(String[] args) throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3

        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5 此处相当于将缓存中4位置的值赋值为5

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}

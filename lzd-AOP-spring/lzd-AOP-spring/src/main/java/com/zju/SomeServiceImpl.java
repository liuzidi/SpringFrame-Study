package com.zju;

/**
 * @author:liuzidi
 * @Description:
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public StudentTest doSome() {
        System.out.println("完成doSome");
        return new StudentTest(23);
    }
}


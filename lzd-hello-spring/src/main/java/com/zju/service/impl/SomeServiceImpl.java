package com.zju.service.impl;

import com.zju.service.SomeService;

/**
 * @author:liuzidi
 * @Description:
 */
public class SomeServiceImpl implements SomeService {
    public String a;
    public String b;
    public School ss;


    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl构造函数调用");
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setSs(School ss) {
        this.ss = ss;
    }

    @Override
    public void doSome() {
        System.out.println("我是SomeServiceImpl的doSome方法");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(ss);

    }
}

package com.zju;

import com.zju.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.*;

import java.lang.reflect.Constructor;


public class test0708 {
    @Test
    public void test01(){
        String config = "beans01/applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        SomeServiceImpl service02 = (SomeServiceImpl) ac.getBean("service02");
        service02.doSome();
    }
    @Test
    public void reflectTest() throws Exception {

        Constructor<PersonTest> constructor = PersonTest.class.getConstructor(int.class, String.class);
        constructor.newInstance((int)16,(String)"xx");
//        PersonTest.class.getConstructor(int.class,String.class).newInstance(18,"XiaoMing");
    }

}
class PersonTest{
    int age;
    String name;

    public PersonTest(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("构造方法被调用啦");
    }
    public PersonTest(){
        System.out.println("空参构造方法被调用");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}




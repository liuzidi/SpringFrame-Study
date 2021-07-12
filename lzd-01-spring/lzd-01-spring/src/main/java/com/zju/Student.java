package com.zju;


import org.springframework.stereotype.Component;

/**
 * @author:liuzidi
 * @Description:
 */

@Component(value="myStudent")
//@Component(value="myStudent01")
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("student class has been ordered");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

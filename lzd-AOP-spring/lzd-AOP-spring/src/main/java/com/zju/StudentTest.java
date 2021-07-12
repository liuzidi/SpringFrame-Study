package com.zju;

/**
 * @author:liuzidi
 * @Description:
 */
public class StudentTest {
    int age;

    public StudentTest(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "age=" + age +
                '}';
    }
}

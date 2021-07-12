package com.zju.service.impl;

/**
 * @author:liuzidi
 * @Description:
 */
public class School {
    String name;
    int grade;

    public School() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

package com.zju.entity;

/**
 * @author:liuzidi
 * @Description:
 */
public class Employee {
    private String name;
    private String sex;
    private String birthday;
    private Integer id;
    private String image;

    public Employee() {
    }

    public Employee(String name, String sex, String birthday, Integer id, String image) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.id = id;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

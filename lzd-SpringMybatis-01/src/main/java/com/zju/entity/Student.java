package com.zju.entity;

/**
 * @author:liuzidi
 * @Description:
 */
public class Student {
    String name;
    Integer id;
    String sex;
    String birthday;
    String image;

    public Student() {
    }

    public Student(String name, Integer id, String sex, String birthday, String image) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.birthday = birthday;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

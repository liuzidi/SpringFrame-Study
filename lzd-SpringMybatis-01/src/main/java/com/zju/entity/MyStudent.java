package com.zju.entity;

/**
 * @author:liuzidi
 * @Description:
 */
public class MyStudent {
    String stuName;
    Integer stuID;
    String stuSex;
    String stuBirthday;
    String stuImage;

    public MyStudent() {
    }

    public MyStudent(String stuName, Integer stuID, String stuSex, String stuBirthday, String stuImage) {
        this.stuName = stuName;
        this.stuID = stuID;
        this.stuSex = stuSex;
        this.stuBirthday = stuBirthday;
        this.stuImage = stuImage;
    }

    public String getStuName() {
        return stuName;
    }

    public Integer getStuID() {
        return stuID;
    }

    public String getStuSex() {
        return stuSex;
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public String getStuImage() {
        return stuImage;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public void setStuImage(String stuImage) {
        this.stuImage = stuImage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuID=" + stuID +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirthday='" + stuBirthday + '\'' +
                ", stuImage='" + stuImage + '\'' +
                '}';
    }
}

package com.learning.domain;

public class student {
    private Integer ID;
    private String stuName;
    private String className;
    private Integer stuAge;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "student{" +
                "ID=" + ID +
                ", stuName=" + stuName +
                ", className=" + className +
                ", stuAge=" + stuAge +
                '}';
    }
}

package com.example.mysqldemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @GeneratedValue(strategy= GenerationType.TABLE)
    int id;
    String name;
    String age;
    String pwd;
    @Id
    String mobile;

    public User(String name, String age, String pwd, String mobile) {
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        this.mobile = mobile;
    }

    public User(int id, String name, String age, String pwd, String mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        this.mobile = mobile;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", pwd='" + pwd + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

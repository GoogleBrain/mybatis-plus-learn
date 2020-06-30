package com.atguigu.mp.beans;

import com.baomidou.mybatisplus.annotations.*;
import com.baomidou.mybatisplus.enums.IdType;

@TableName(value = "tbl_employee")
public class Employee {
    @TableId(type = IdType.AUTO)
    private Integer id ;
    private String lastName;
    private String email ;
    private Integer gender ;
    private Integer age ;
    @Version
    private Integer version;

    @TableLogic
    private Integer logicFlag;

    public Integer getLogicFlag() {
        return logicFlag;
    }

    public void setLogicFlag(Integer logicFlag) {
        this.logicFlag = logicFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", version=" + version +
                ", logicFlag=" + logicFlag +
                '}';
    }
}

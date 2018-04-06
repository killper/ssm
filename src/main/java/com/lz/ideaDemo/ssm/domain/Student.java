package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/3 0003.
 */
public class Student implements Serializable {

    private long id;

    private String name;

    private Class c;//所属班级

    public Class getC() {
        return c;
    }

    public void setC(Class c) {
        this.c = c;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", c=" + c +
                '}';
    }
}

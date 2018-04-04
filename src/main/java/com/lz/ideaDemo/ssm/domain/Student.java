package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/3 0003.
 */
public class Student implements Serializable {

    private long id;

    private String stu_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
}

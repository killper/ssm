package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;

public class Class implements Serializable {

    private long id;

    private String c_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
}

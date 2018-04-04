package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;

public class Teacher implements Serializable {

    private long id;

    private  String t_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}

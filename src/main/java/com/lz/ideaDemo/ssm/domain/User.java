package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/3 0003.
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

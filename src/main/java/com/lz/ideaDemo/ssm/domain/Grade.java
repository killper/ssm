package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;
import java.util.Set;

public class Grade implements Serializable {

    private long id;

    private String name;

    private Set<Class> classSet;//班级集合

    public Set<Class> getClassSet() {
        return classSet;
    }

    public void setClassSet(Set<Class> classSet) {
        this.classSet = classSet;
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
}

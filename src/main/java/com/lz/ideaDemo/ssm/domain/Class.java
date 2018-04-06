package com.lz.ideaDemo.ssm.domain;

import java.io.Serializable;
import java.util.Set;

public class Class implements Serializable {

    private long id;

    private String name;

    private Grade grade;//所属年级

    private Set<Student> studentSet;//学生集合

    private Set<Teacher> teacherSet;//老师集合

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
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

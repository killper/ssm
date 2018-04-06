package com.lz.ideaDemo.ssm.dao;

import com.lz.ideaDemo.ssm.domain.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> selectAllStudent();
}

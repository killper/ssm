package com.lz.ideaDemo.ssm.test.dao;

import com.lz.ideaDemo.ssm.dao.StudentMapper;
import com.lz.ideaDemo.ssm.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @org.junit.Before
    public void setUp() throws Exception {
        InputStream is = new FileInputStream("E:\\Program Files (x86)\\JetBrains\\ssm\\src\\main\\resources\\mybatis\\mybatis-config.xml");
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @org.junit.Test
    public void selectAllStudent() {
        SqlSession session = this.sqlSessionFactory.openSession();
        List<Student> list = session.getMapper(StudentMapper.class).selectAllStudent();
        System.out.println(list);
    }
}
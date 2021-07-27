package com.ljq.mybatis03.service.impl;

import com.ljq.mybatis03.dao.StudentDao;
import com.ljq.mybatis03.domain.Student;
import com.ljq.mybatis03.service.StudentService;
import com.ljq.mybatis03.util.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> stuList =studentDao.getAll();
        return stuList;
    }




}

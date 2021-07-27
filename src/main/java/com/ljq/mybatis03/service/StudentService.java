package com.ljq.mybatis03.service;

import com.ljq.mybatis03.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
     Student getById(String id);
     void save(Student s);
     List<Student> getAll();
}

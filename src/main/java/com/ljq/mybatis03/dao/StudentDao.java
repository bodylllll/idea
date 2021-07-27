package com.ljq.mybatis03.dao;

import com.ljq.mybatis03.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
     Student getById(String id);
     void save(Student s);

     List<Student> getAll();

     List<Student> select5(Map<String, Object> map);

    Student select6(String id);

    List<Student> select7(String z);

    List<Student> select8(String z);

    List<Student> select9();

    List<Student> select10(Student s);
}

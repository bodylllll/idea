package com.ljq.mybatis03.test;

import com.ljq.mybatis03.dao.StudentDao;
import com.ljq.mybatis03.domain.Student;
import com.ljq.mybatis03.service.StudentService;
import com.ljq.mybatis03.service.impl.StudentServiceImpl;
import com.ljq.mybatis03.util.ServiceFactory;
import com.ljq.mybatis03.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
/*      Student s = new Student();
        s.setId("A006");
        s.setAge(23);
        s.setName("cxk");
        ss.save(s);*/
/*        List<Student> stuList = ss.getAll();
        for(Student s : stuList){
            System.out.println(s);
        }*/
        /*Student s = ss.getById("A005");*/
/*        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "wyf");
        map.put("age", 23);
        List<Student> sList = studentDao.select5(map);
        for (Student s : sList) {
            System.out.println(s);
        }*/
/*      使用${}来接受值
        Student s = studentDao.select6("A006");
        System.out.println(s);
        */
        /*
        *   like模糊查询 方式1：使用${} 了解
        * */
/*        List<Student> sList = studentDao.select7("z");
        for (Student s : sList){
            System.out.println(s);
        }*/
        /*
        * like模糊查询 使用#{}
        * */
        Student s = new Student();
        /*s.setName("z");*/
        s.setAge(25);
        List<Student> sList = studentDao.select10(s);
        for (Student a : sList){
            System.out.println(a);
        }
    }
}

package com.wang.service;

import com.wang.dao.StudentDao;
import com.wang.domain.Student;

public class StudentService {

    private StudentDao studentDao;

    public Student cha(String sid) {
        return studentDao.selectOne(sid);
    }
}

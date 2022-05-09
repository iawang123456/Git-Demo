package com.wang.service;

import com.wang.dao.StudentDao;
import com.wang.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student cha(String sid) {
        return studentDao.selectOne(sid);
    }

    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    public void toUpdate(Student student) {
        studentDao.toUpdate(student);
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void deleteStudent(String sid) {
        studentDao.deleteStudent(sid);
    }
}

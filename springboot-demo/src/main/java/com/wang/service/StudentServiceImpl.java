package com.wang.service;

import com.wang.dao.StudentMapper;
import com.wang.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

/*    public Student cha(String sid) {
        return studentDao.selectOne(sid);
    }*/

    @Override
    public List<Student> getStudentAll() {
        return studentMapper.getStudentAll();
    }

    /*public void toUpdate(Student student) {
        studentDao.toUpdate(student);
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void deleteStudent(String sid) {
        studentDao.deleteStudent(sid);
    }*/
}

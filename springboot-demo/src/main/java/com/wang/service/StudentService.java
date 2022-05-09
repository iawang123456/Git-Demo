package com.wang.service;


import com.wang.dao.StudentMapper;
import com.wang.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {

    List<Student> getStudentAll();
}

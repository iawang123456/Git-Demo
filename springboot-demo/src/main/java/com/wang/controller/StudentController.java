package com.wang.controller;


import com.wang.domain.Student;
import com.wang.service.StudentService;

public class StudentController {

    private StudentService studentService;

    public String selectOneStudent(Student student) {

        Student studentOne = studentService.cha(student.getSid());
        return studentOne.toString();
    }
}

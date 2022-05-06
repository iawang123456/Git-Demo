package com.wang.dao;


import com.wang.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private static List<Student> studentList = new ArrayList();

    static{
            studentList.add(new Student("1","曹操","男"));
            studentList.add(new Student("2","奉先","男"));
            studentList.add(new Student("3","刘备","男"));
            studentList.add(new Student("4","小乔","女"));
            studentList.add(new Student("5","大桥","女"));
            studentList.add(new Student("6","关云长","男"));
            studentList.add(new Student("7","张飞","男"));
            studentList.add(new Student("8","张辽","男"));
            studentList.add(new Student("9","赵子龙","男"));
            studentList.add(new Student("10","孔明","男"));
        }


    public Student selectOne(String sid) {
        Student student = studentList.get(Integer.parseInt(sid));
        if(student != null) {
            return student;
        }
        return null;
    }
}

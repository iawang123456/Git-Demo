package com.wang.dao;


import com.wang.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {

    List<Student> getStudentAll();

    /*private static List<Student> studentList = new ArrayList();

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
        return new Student("","","");
    }

    public List<Student> selectAll() {
        return studentList;
    }

    public void toUpdate(Student student) {
        //student1是从数据库中查出来的结果
        Student student1 = selectOne(student.getSid());
        if(student1 != null && student1.getSid().equals(-1)) {
            student1.setSid(student.getSid());
            student1.setSname(student.getSname());
            student1.setSsex(student.getSsex());
        }
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudent(String sid) {
        studentList.remove(selectOne(sid));
    }*/
}

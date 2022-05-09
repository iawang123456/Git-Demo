package com.wang.controller;


import com.wang.model.Student;
import com.wang.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Controller
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;
/*    @GetMapping("/{sid}")
    public String selectOneStudent(Model model,@PathVariable("sid")String sid) {
        try{
            Integer.parseInt(sid);
            Student student = studentService.cha(sid);
            model.addAttribute("student",student);
        }catch(NumberFormatException n){
            System.out.println("输入的编号有误,请从新输入");
            return "/NumberFormatException";
        }
        return "/student";
    }*/

    @GetMapping
    public String selectAll(Model model){
        List<Student> studentList = studentService.getStudentAll();
        model.addAttribute("studentList", studentList);
        return "student";
    }

/*    @GetMapping("/{student}")
    public void toUpdate(Student student) {

    }*/

}

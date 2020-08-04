package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "张三", 18));
        students.add(new Student(2, "李四", 28));
        students.add(new Student(3, "王五", 19));
        model.addAttribute("students", students);
        return "index";
    }
}

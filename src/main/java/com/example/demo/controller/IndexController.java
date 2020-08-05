package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5, "张三", 18));
        students.add(new Student(2, "李四", 28));
        students.add(new Student(7, "王五", 19));
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/index2")
    public String index2(Map<String, String> map) {
        map.put("name", "带带");
        return "index2";
    }

    @GetMapping("/if/{value}")
    public String index3(Map<String, Boolean> map,  @PathVariable("value")Boolean flag) {
        map.put("flag", flag);
        return "index2";
    }

    @GetMapping("/url")
    public String index4( Map<String, String> map) {
        map.put("path", "sogou.com");
        return "index2";
    }

    @GetMapping("/img")
    public String index5(Map<String, String> map) {
        map.put("src", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2353039266,4057819296&fm=26&gp=0.jpg");
        return "index2";
    }

    @GetMapping("/sanmu/{value}")
    public String index6(Model model, @PathVariable("value")Integer age) {
        model.addAttribute("age", age);
        return "index2";
    }

    @GetMapping("/switch/{value}")
    public String test(Model model, @PathVariable("value")String gnder) {
        model.addAttribute("gender", gnder);

        return "index2";
    }

    @GetMapping("/util")
    public String test(Model model) {
        model.addAttribute("name", "zhangsan");
        model.addAttribute("users", new ArrayList<String>());
        model.addAttribute("count", 8);
        model.addAttribute("date", new Date());
        return "util";
    }
}

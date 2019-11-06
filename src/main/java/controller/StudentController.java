package main.java.controller;

import main.java.dao.Student;
import main.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author xiaozhangjie
 * @version 1.0
 * @date 2019/11/4 0004 16:23
 */
@Controller
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService studentService;
    /**
     * 查找所有学生
     * @return
     */
    @RequestMapping("/{queryID}")
    public ModelAndView test(@PathVariable String queryID){
        List<Student> list = studentService.find(queryID);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/query");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

}

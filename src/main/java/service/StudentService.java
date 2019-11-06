package main.java.service;

import main.java.dao.Student;

import java.util.List;

/**
 * @author xiaozhangjie
 * @version 1.0
 * @date 2019/11/4 0004 16:43
 */
public interface StudentService {
    public List<Student> find(String queryID);

}

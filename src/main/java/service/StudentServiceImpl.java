package main.java.service;

import main.java.dao.StudentDAO;
import main.java.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaozhangjie
 * @version 1.0
 * @date 2019/11/4 0004 16:45
 */
@Service
public class StudentServiceImpl implements main.java.service.StudentService {
@Autowired
   private StudentDAO studentDAO;

    @Override
    public List<Student> find(String queryID) {
        if (queryID.equals("12345")){
            return studentDAO.findAll();
        }else {
            return studentDAO.find(queryID);

        }
    }
}

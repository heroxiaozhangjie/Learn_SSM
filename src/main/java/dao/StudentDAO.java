package main.java.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xiaozhangjie
 * @version 1.0
 * @date 2019/11/4 0004 16:46
 */
@Repository
public interface StudentDAO {
    List<main.java.dao.Student> find(String queryID);

    List<main.java.dao.Student> findAll();
}

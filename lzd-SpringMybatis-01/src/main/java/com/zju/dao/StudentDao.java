package com.zju.dao;

import com.zju.entity.Student;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public interface StudentDao {
    public List<Student> selectAll();
}

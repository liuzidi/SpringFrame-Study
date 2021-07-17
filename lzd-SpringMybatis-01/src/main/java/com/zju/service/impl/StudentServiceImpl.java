package com.zju.service.impl;

import com.zju.dao.StudentDao;
import com.zju.entity.Student;
import com.zju.service.StudentService;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    /**
     * set注入方式创建StudentDao的DAO对象
     */
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> queryStudents() {
        return studentDao.selectAll();
    }
}

package com.zju.dao;

import com.zju.entity.Employee;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public interface EmployeeDao {
    public List<Employee> selectEmployees();


}

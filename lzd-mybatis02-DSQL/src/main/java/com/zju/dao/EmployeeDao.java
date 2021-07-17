package com.zju.dao;

import com.zju.entity.Employee;

import java.util.List;
import java.util.Map;

/**
 * @author:liuzidi
 * @Description:
 */
public interface EmployeeDao {
    public Employee selectByID(Integer id);
    public List<Employee> selectByIDMap(Integer id);
}

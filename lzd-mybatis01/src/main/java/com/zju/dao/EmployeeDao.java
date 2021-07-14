package com.zju.dao;

import com.zju.entity.Employee;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public interface EmployeeDao {
    public List<Employee> selectEmployees();

    /**
     *
     * @param  employee
     * @return 影响的行数
     */
    public int insertEmployees(Employee employee);



}

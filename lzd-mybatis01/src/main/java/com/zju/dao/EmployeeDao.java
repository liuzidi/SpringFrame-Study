package com.zju.dao;

import com.zju.entity.Employee;

import java.util.List;
import java.util.Map;

/**
 * @author:liuzidi
 * @Description:
 */
public interface EmployeeDao {
    List<Employee> selectEmployees();
    int insertEmployees(Employee employee);
    Map<Object,Object> selectMapById(String sex);

}

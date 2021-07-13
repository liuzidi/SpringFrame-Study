package com.zju;

import com.zju.entity.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public class MyTest {
    @Test
    public void test01() throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlID = "com.zju.dao.EmployeeDao" + "." + "selectEmployees";
        List<Employee> employeeList = sqlSession.selectList(sqlID);
        employeeList.forEach(System.out::println);
        sqlSession.close();


    }

}

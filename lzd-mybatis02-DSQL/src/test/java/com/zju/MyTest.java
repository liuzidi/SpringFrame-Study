package com.zju;

import com.zju.dao.EmployeeDao;
import com.zju.entity.Employee;
import com.zju.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 * @author:liuzidi
 * @Description:
 */
public class MyTest {

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
/**
 * 代码区
 */
        Employee employee = dao.selectByID(4);
        System.out.println(employee);

/**
 * 代码区
 */
        sqlSession.close();
    }
    @Test
    public void test04(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
/**
 * 代码区
 */
        System.out.println(dao.selectByIDMap(4));

/**
 * 代码区
 */
        sqlSession.close();
    }
}

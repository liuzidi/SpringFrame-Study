package com.zju.util;

import com.zju.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author:liuzidi
 * @Description:
 */
public class MybatisUtil {
    private static  SqlSession sqlSession;
    static {
        String config = "mybatis.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession = factory.openSession();
    }

    public static SqlSession getSqlSession(){
        return sqlSession;
    }
}

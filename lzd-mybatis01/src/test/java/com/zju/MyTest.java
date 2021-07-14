package com.zju;

import com.zju.entity.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public class MyTest {
    @Test
    public void test01() throws IOException {
        String config = "mybatis.xml";
        //Resources：mybatis中的一个类负责读取主配置文件
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlID = "com.zju.dao.EmployeeDao" + "." + "selectEmployees";
        /**
         * select
         */
        List<Employee> employeeList = sqlSession.selectList(sqlID);
        employeeList.forEach(System.out::println);
        /**
        * insert
        */
//        Employee e = new Employee("公孙离","女","2021-07-14",11,"j");
//        int nums = sqlSession.insert(sqlID, e);
//        //mybatis默认不自动提交事务，需要手动提交
//        sqlSession.commit();
//        System.out.println(nums);

        sqlSession.close();
    }

    @Test
    public void test2() throws UnsupportedEncodingException {
        String old = "手机银行";
        //中文转换成UTF-8编码（16进制字符串)
        StringBuffer utf8Str = new StringBuffer();
        byte[] utf8Decode = old.getBytes("utf-8");
        for (byte b : utf8Decode) {
            utf8Str.append(Integer.toHexString(b & 0xFF));
        }
        //utf8Str.toString()=====e6898be69cbae993b6e8a18c
        //System.out.println("UTF-8字符串e6898be69cbae993b6e8a18c转换成中文值======" + new String(utf8Decode, "utf-8"));//-------手机银行
        //中文转换成GBK码（16进制字符串)
        StringBuffer gbkStr = new StringBuffer();
        byte[] gbkDecode = old.getBytes("gbk");
        for (byte b : gbkDecode) {
            gbkStr.append(Integer.toHexString(b & 0xFF));
        }
    }
}

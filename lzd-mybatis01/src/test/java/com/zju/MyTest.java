package com.zju;

import com.zju.dao.EmployeeDao;
import com.zju.entity.Employee;
import com.zju.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * @author:liuzidi
 * @Description:
 */
public class MyTest {

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
    @Test
    public void test01() throws IOException {
        String config = "mybatis.xml";
        //Resources：mybatis中的一个类负责读取  主配置文件
        InputStream in = Resources.getResourceAsStream(config);
        //SqlSessionFactoryBuilder作用：创建sqlSessionFactory对象，不重要
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //SqlSessionFactory:重量级对象，整个项目一般只有一个，作用：获取SqlSession对象
        /**
         * 接口：实现类DefaultSqlSessionFactory
         */
        SqlSessionFactory factory = builder.build(in);
        //SqlSession接口：定义了selectOne，insert，update等接口的实现类
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
//        关闭连接
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        /**
         * 采用Dao方式调用DAO中直接定义好的函数
         */
        EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
        Map<Object,Object> map = dao.selectMapById("b");
        /**
         * 采用传统方式进行
         */
//        String sqlID = "com.zju.dao.EmployeeDao" + "." + "selectMapById";
//        Map<Object, Object> map = sqlSession.selectMap(sqlID,"id");
        System.out.println(map);
        sqlSession.close();
    }
}

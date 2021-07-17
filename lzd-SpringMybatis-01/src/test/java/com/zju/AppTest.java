package com.zju;

import com.zju.dao.StudentDao;
import com.zju.entity.Student;
import com.zju.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppTest {

    @Test
    public void test1(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        String names[] = ctx.getBeanDefinitionNames();
        for(String na:names){
            System.out.println("容器中对象名称："+na+"|"+ctx.getBean(na));
        }
    }
    @Test
    public void test2(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentDao sd = (StudentDao) ctx.getBean("studentDao");
        List<Student> students = sd.selectAll();
        students.forEach(System.out::println);

    }
    @Test
    public void test3(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService ss = (StudentService) ctx.getBean("studentService");
        List<Student> students = ss.queryStudents();
        students.forEach(System.out::println);

    }
}

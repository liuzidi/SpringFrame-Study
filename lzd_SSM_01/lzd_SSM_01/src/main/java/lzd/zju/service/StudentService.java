package lzd.zju.service;

import lzd.zju.domain.Student;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public interface StudentService  {
    int addStudent(Student student);
    List<Student> findStudents();
}

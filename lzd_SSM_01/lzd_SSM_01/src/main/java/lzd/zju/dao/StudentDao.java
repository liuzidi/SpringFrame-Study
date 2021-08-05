package lzd.zju.dao;

import lzd.zju.domain.Student;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}

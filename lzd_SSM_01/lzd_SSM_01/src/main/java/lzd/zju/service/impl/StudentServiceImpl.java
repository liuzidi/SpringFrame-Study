package lzd.zju.service.impl;

import lzd.zju.dao.StudentDao;
import lzd.zju.domain.Student;
import lzd.zju.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:liuzidi
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents();
    }
}

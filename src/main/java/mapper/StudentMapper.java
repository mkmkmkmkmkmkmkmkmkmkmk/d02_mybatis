package mapper;

import pojo.Student;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-20_周一 10:57
 **/
public interface StudentMapper {
    Student findStudentById(Integer id);
    List<Student> findStudents();
}

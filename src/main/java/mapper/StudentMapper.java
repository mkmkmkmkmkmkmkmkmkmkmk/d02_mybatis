package mapper;

import org.apache.ibatis.annotations.Param;
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

    /**
     * 两个参数
     * @param id
     * @param name
     * @return
     */
    Student findStudent1(Integer id,String name);
    Student findStudent2(@Param("id") Integer id,@Param("name") String name);

}

package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Student;

import java.util.List;
import java.util.Map;

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
     * 不推荐使用，需要查看配置文件才能知道怎么在类中传递参数
     * @param conditions
     * @return
     */
    List<Student> findStudents1(Map<String,Object> conditions);

    /**
     * 两个参数：@param注解可以使用该注解自己指定占位符的名称
     * @param id
     * @param name
     * @return
     */
    Student findStudent1(Integer id,String name);


    Student findStudent2(@Param("id") Integer id,@Param("name") String name);



    /**
     * 模糊查询测试
     * @param name
     * @return
     */
    List<Student> findStudentsByName(String name);

    /**
     *ResultType结果集的自动映射
     * @return
     */
    Student findStudents2();

    /**
     *测试 mapUnderscoreToCamelCase为true
     * @return
     */
    List<Student> findStudents3();

    List<Student> findAl1Students();

    /**
     * 主键自增保存一个学生
     * @return
     */
    int saveStudent(Student student);
    /**
     *非主键自增保存一个学生
     */
    int saveStudent1(Student student);

    /**
     *
     * @param name
     * @param nativeProvince
     * @return
     */
    //List<Student>findStudents(String name,String nativeProvince);
    List<Student> findStudents5(@Param("name") String name,@Param("nativeProvince") String nativeProvince);


}

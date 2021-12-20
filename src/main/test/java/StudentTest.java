import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import mapper.StudentMapper;
import org.junit.Test;
import pojo.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-20_周一 15:32
 **/
public class StudentTest extends BaseSqlSession{
    @Test
    public void FindStudentsByPageTest(){
        //参数1:查看的页码;参数2:每页显示的记录条数
        PageHelper.startPage(1,3);
        //2、封装查询到的所有记录，自动完成分页
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=mapper.findStudents();
        /*3.查询分页记录*/
        PageInfo<Student> studentPageInfo = new PageInfo<Student>(studentList);
        /*查询分页记录*/
        System.out.println("分页记录：");
        studentPageInfo.getList().forEach(System.out::println);

    }

    /**
     * 2.2.1测试查询有一个参数的sql语句
     */
    @Test
    public void TwoParamTest1() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.findStudent1(1,"李四");
        System.out.println(student);
    }

    /**
     * 2.2.2测试查询有两个参数的sql语句
     */
    @Test
    public void TwoParamTest2() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.findStudent2(2,"李四");
        System.out.println(student);
    }
    @Test
    public void MapParamTest(){
        Map<String,Object> map=new HashMap<>();
        map.put("idd",5);
        map.put("name","李四");
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.findStudents1(map);
        System.out.println(students);
    }

    /**
     * 测试模糊查询
     */
    @Test
    public  void vagueWordsTest(){
        StudentMapper mapper= sqlSession.getMapper(StudentMapper.class);
        List<Student> student=mapper.findStudentsByName("张三");
        System.out.println(student);
    }
    /**
     * 数据库别名查询
     */
    @Test
    public void aliasTest(){
        StudentMapper mapper= sqlSession.getMapper(StudentMapper.class);
        Student student=mapper.findStudents2();
        System.out.println(student);
    }

    /**
     *  测试<setting name="mapUnderscoreToCamelCase" value="true"/>
     *  主要用于==结果集的字段名==和实体类的属性名一致的情况。
     */
    @Test
    public void ResultTypeTest(){
        StudentMapper mapper= sqlSession.getMapper(StudentMapper.class);
        List<Student> student=mapper.findStudents3();
        System.out.println(student);
    }

}
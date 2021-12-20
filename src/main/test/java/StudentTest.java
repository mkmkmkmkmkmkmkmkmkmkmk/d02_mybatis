import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import mapper.StudentMapper;
import org.junit.Test;
import pojo.Student;

import java.util.List;

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
    @Test
    public void OneParamTest() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.findStudentById(1);
        System.out.println(student);
    }
 }
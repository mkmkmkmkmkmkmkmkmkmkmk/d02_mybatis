import mapper.EmployeeMapper;
import org.junit.Test;
import pojo.Employee;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-21_周二 12:57
 **/
public class EmployeeTest extends BaseSqlSession{
    @Test
    public void RightJoinTest(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList=mapper.findAllEmployeesByDepts();
        for (Employee employee:
             employeeList) {
            System.out.println("-------------------");
            System.out.println(employee);
            System.out.println(employee.getDepartment());
        }
    }

    /**
     * 2.嵌套查询
     */
    @Test
    public void Test(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList=mapper.findAllEmpsWithDepts1();
        for (Employee employee:
             employeeList) {
            System.out.println("-------------------");
            System.out.println(employee);
            System.out.println(employee.getDepartment());
        }
    }
}

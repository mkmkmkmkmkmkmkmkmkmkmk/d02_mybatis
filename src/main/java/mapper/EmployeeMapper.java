package mapper;

import pojo.Employee;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-21_周二 12:50
 **/
public interface EmployeeMapper {
    ///连接查询:查询所有的员工及员工所属的部门

    List<Employee> findAllEmployeesByDepts();
    //嵌套查询:
    List<Employee> findAllEmpsWithDepts1();
    //嵌套查询:根部门did查询员工
    List<Employee> findEmpsById(Integer did);

}

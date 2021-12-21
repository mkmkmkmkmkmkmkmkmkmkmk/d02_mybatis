package mapper;

import pojo.Department;
import pojo.Employee;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-21_周二 15:07
 **/
public interface DepartmentMapper {
    //1.连接查询:查询所有部门，关联查询对应的员工
    List<Department> findAllDeptsWithEmps();

    //2.嵌套查询:嵌套查询之查询关联的一的数据
    Department findDeptByDid(Integer did) ;
    //嵌套查询
    List<Department> findAllDeptsWithEmps1();

}

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
    //连接查询:查询所有部门，关联查询对应的员工
    List<Department> findAllDeptsWithEmps();


    Department findDeptByDid(Integer did) ;
}

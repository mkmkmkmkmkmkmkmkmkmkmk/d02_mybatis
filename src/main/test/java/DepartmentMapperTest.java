import mapper.DepartmentMapper;
import mapper.EmployeeMapper;
import org.junit.Test;
import pojo.Department;
import pojo.Employee;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-21_周二 15:16
 **/
public class DepartmentMapperTest extends BaseSqlSession{
    /**
     *
     */
    @Test
    public void LeftJoinTest(){
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departmentList=mapper.findAllDeptsWithEmps();
        for (Department department:
                departmentList) {
            System.out.println("-------------------");
            System.out.println(department);
            System.out.println(department.getDname());
        }
    }
}

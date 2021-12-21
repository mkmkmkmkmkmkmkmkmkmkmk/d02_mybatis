package pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mapper.EmployeeMapper;

import java.io.Serializable;
import java.util.List;
/**
 * 1.单向一对多
 * 5.连接查询映射之查询关联的多的数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private Integer did;
    private String dname;
    private List<Employee> emps;
}

/**
 * 2.单向多对1
  */
/*@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable{
    private Integer did;
    private String dname;
    private List<Employee> emps;
}*/
/**
 * 3.双向一对多
 */
/*@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable{
    private Integer did;
    private String dname;
    private List<Employee> emps;
}*/
/**
 * 4.查询关联的一的一方数据
 */
/*
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable{
    private Integer did;
    private String dname;
}*/

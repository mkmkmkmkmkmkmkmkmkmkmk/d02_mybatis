package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 1.单向一对多
 */
/*@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
    private Integer eid;
    private String ename;
    private Float salary;
}*/
/**
 * 2.单向一对多
 */
/*@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
    private Integer eid;
    private String ename;
    private Float salary;
}*/
/**
 * 3.双向一对多
 * 4.查询关联的一的一方数据
 * 5.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private Integer eid;
    private String ename;
    private Float salary;
    private Department department;
}

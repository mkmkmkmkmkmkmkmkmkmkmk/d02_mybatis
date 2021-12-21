package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *1.单向多对多
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private Integer tid;
    private String tname;
    private  Float salary;
}
/**
 * 2.单向多对多
 */
/*@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher1 implements Serializable{
    private Integer tid;
    private String tname;
    private  Float salary;
}*/
/**
 * 双向多对多
 */
/*
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher1 implements Serializable{
    private Integer tid;
    private String tname;
    private  Float salary;
    public List<Student> stud;
}*/

package pojo;
/**
 * POJO普通的JavaBean的书写要求：
 * 1、必须有默认的构造方法
 * 2、字段都是私有的
 * 3、提供public的getter或setter访问属性
 * 4、一般需要实现java.io.Serializable接口
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-19_周日 21:26
 **/
@Data  //getter setter toString hashCode equals
@AllArgsConstructor //利用所有字段创建构造方法
@NoArgsConstructor //创建默认构造方法
public class Student implements Serializable {
    private Integer id;//建议使用包装类型。
    private String name;
    private Boolean gender;
    private Character grade;
}
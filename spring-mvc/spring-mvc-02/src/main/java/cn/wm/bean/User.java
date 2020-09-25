package cn.wm.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * user
 * @author 
 */
@Data
@Accessors(chain = true)
public class User{
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}
package cn.liumouren.example.security.pure.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (User)表实体类
 *
 * @author daniel liu
 */
@Data
@TableName("user")
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * 权限(,分隔)
     */
    private String authorities;

}

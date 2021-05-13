package cn.liumouren.example.seata.account.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Account)表实体类
 *
 * @author daniel liu
 */
@Data
@TableName("account")
public class Account implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 余额
     */
    private Double money;

}

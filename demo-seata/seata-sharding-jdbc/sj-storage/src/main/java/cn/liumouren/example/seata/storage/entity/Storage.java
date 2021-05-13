package cn.liumouren.example.seata.storage.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Storage)表实体类
 *
 * @author daniel liu
 */
@Data
@TableName("storage")
//@TableName("storage_1")
public class Storage implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 商品编码
     */
    private String commodityCode;
    /**
     * 剩余数量
     */
    private Integer count;

}

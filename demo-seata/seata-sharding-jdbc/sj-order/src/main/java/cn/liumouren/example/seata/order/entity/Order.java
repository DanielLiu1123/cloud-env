package cn.liumouren.example.seata.order.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Order)表实体类
 *
 * @author daniel liu
 */
@Data
@TableName("`order`")
public class Order implements Serializable {
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
     * 商品编码
     */
    private String commodityCode;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 价格
     */
    private Double money;

}

package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/27 21:12
 * @Description:
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    /** 订单id */
    @Id
    private String orderId;

    /** 买家姓名 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认为新下单NEW */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认为未支付0 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间 */
//    private Date createTime;

    /** 更新时间 */
//    private Date updateTime;

}

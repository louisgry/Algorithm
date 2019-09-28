package com.imooc.repository;

import com.imooc.SellApplicationTests;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/27 21:53
 * @Description:
 */
@Component
public class OrderDetailRepositoryTest extends SellApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345678910");
        orderDetail.setOrderId("111111112");
        orderDetail.setProductId("111111112");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        String orderId = "111111112";
        List<OrderDetail> orderDetailList = orderDetailRepository.findByOrderId(orderId);
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}
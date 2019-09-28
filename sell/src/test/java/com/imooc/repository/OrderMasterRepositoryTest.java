package com.imooc.repository;

import com.imooc.SellApplicationTests;
import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


/**
 * @Author: Louis
 * @Date: Create in 2019/9/27 22:01
 * @Description:
 */
@Component
public class OrderMasterRepositoryTest extends SellApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("Louis");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("China");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        String openid = "110110";
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<OrderMaster> page = orderMasterRepository.findByBuyerOpenid(openid, pageRequest);
        System.out.println(page.getTotalElements());
        System.out.println(page.getContent());
        Assert.assertNotEquals(0, page.getTotalElements());
    }
}
package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;
import com.imooc.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertTrue(productInfoList.size()>0);
    }

    @Test
    public void findListForOrder() {
        List<ProductInfo> productInfoList = productService.findListForOrder(Arrays.asList("123457"));
        Assert.assertTrue(productInfoList.size()>0);
    }

    @Test
    public void decreaseStock() {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setProductId("123456");
        cartDTO.setProductQuantity(2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}
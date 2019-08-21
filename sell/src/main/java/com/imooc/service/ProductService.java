package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    /** 查询所有在架的商品列表 */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable); // 分页参数

    ProductInfo save(ProductInfo productInfo);

    // 加库存

    // 减库存
}

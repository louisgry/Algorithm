package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品信息（给订单服务用）
     */
    List<ProductInfo> findListForOrder(List<String> productIdList);

    /**
     * 扣库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);

}

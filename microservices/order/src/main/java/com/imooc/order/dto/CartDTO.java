package com.imooc.order.dto;

import lombok.Data;

@Data
public class CartDTO {

    private String productId;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }

    private Integer productQuantity;
}

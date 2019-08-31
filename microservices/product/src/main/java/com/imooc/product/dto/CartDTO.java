package com.imooc.product.dto;

import lombok.Data;

@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }


}

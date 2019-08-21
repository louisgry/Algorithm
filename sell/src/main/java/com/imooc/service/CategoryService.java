package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {

    /** 根据categoryId查找类目 */
    ProductCategory findOne(Integer categoryId);

    /** 查找所有类目 */
    List<ProductCategory> findAll();

    /** 根据categoryTypeList查找类目 */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /** 类目插入和修改　*/
    ProductCategory save(ProductCategory productCategory);
}

package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class CategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(new Integer(1));
        Assert.assertTrue(productCategory.getCategoryId()==1);
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertTrue(productCategoryList.size()>0);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(2,3));
        Assert.assertTrue(productCategoryList.size()>0);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("折扣",11);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertTrue(result != null);
    }
}
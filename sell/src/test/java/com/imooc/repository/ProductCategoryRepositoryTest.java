package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("女生最爱");
//        productCategory.setCategoryType(3);
//        productCategoryRepository.save(productCategory);

//        ProductCategory productCategory = productCategoryRepository.findOne(2);
//        productCategory.setCategoryType(3);
//        productCategoryRepository.save(productCategory);

        ProductCategory productCategory = new ProductCategory("男生最爱", 10);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}
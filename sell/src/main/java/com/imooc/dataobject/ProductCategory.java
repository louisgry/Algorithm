package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目实体类
 */
@Entity
@DynamicUpdate // 动态更新时间
@Data // lombok: 不需要重写Getter and Setter
public class ProductCategory {

    /** 类目ID */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

//    /** 创建时间 */
//    private Date createTime;
//
//    /** 修改时间 */
//    private Date updateTime;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName, Integer categoryType){
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author esha
 */
@Entity
@Table(name = "products")
public class Product {
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "products_seq_gen")
    @SequenceGenerator(name="products_seq_gen",sequenceName="PRODUCT_SEQ")
    private int product_id;

    private String name;
//        @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_id")
//    private Category category;

     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subcategory_id")
    private SubCategory subCategory;

    private String details;

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }
    
}

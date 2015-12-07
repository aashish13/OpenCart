/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author esha
 */
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "products_seq_gen")
    @SequenceGenerator(name = "products_seq_gen", sequenceName = "PRODUCT_SEQ")
    private int product_id;

    @NotEmpty(message = "Product Name can not be empty")
    private String name;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_id")
//    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subcategory_id")
    @NotNull(message = "Select Sub Category")
    private SubCategory subCategory;

     @OneToOne(targetEntity = Promotion.class,mappedBy = "product")
    private Set<Promotion> promotions;
    
    @NotEmpty(message = "Product Details can not be empty")
    private String details;
    
    private String img;

    @OneToMany(targetEntity = ProductReview.class,mappedBy = "product")
    private Set<ProductReview> product_reviews;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }


    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
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

    public Set<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        this.promotions = promotions;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Set<ProductReview> getProduct_reviews() {
        return product_reviews;
    }

    public void setProduct_reviews(Set<ProductReview> product_reviews) {
        this.product_reviews = product_reviews;
    }
}

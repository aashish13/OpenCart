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
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Aashish
 */
@Entity(name="sub_categories")
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "sub_categories_seq_gen")
    @SequenceGenerator(name="sub_categories_seq_gen",sequenceName="SUB_CATEGORY_SEQ")
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    
    @OneToMany(targetEntity = Product.class,mappedBy = "subCategory")
    private Set<Product> products;
    
    private String subCategory;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    public String getSubCategory() {
        return subCategory;
    }
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
}
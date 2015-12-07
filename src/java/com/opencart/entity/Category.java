/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.entity;

import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Aashish
 */
@Entity(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "categories_seq_gen")
    @SequenceGenerator(name="categories_seq_gen",sequenceName="CATEGORY_SEQ")
    private int id;
    
    @Column(unique = true)
    @Size(min = 3,max=20,message = "Category must be 5 to 20 character long") @NotEmpty(message = "Category can not be empty.")
    private String category;
    
    @OneToMany(targetEntity = SubCategory.class,mappedBy = "category", fetch=FetchType.EAGER)
    private Set<SubCategory> subCategories;

//        @OneToMany(targetEntity = Product.class,mappedBy = "product")
//    private Set<SubCategory> products;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Set<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
    private String category;

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
}

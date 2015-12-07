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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author esha
 */
@Entity
@Table(name = "promotions")
public class Promotion {
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "promotions_seq_gen")
    @SequenceGenerator(name="promotions_seq_gen",sequenceName="PROMOTION_SEQ")
    private int id;
    private String promotion_description;
     @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getPromotion_description() {
        return promotion_description;
    }

    public void setPromotion_description(String promotion_description) {
        this.promotion_description = promotion_description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



    
}

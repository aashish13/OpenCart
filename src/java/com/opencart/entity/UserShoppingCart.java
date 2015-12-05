/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Bangalore-pc
 */
@Entity
@Table(name = "user_shopping_cart")
public class UserShoppingCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "user_shopping_cart_seq_gen")
    @SequenceGenerator(name="user_shopping_cart_seq_gen",sequenceName="USER_SHOPPING_CART_SEQ")
    private int id;

}
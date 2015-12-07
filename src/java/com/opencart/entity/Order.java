/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Aashish
 */
@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "orders_seq_gen")
    @SequenceGenerator(name="orders_seq_gen",sequenceName="ORDERS_SEQ")
    private int id;
    
    @OneToMany(targetEntity = ProductOrder.class,mappedBy = "order")
    private Set<ProductOrder> product_orders;
       
    @ManyToOne
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<ProductOrder> getProduct_orders() {
        return product_orders;
    }

    public void setProduct_orders(Set<ProductOrder> product_orders) {
        this.product_orders = product_orders;
    }

   

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    
}

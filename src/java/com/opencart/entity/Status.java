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

/**
 *
 * @author Aashish
 */
@Entity(name="statuses")
public class Status {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "statuses_seq_gen")
    @SequenceGenerator(name="statuses_seq_gen",sequenceName="STATUSES_SEQ")
    private int id;
    private String status;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

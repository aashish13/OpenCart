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
@Entity(name = "payment_details")
public class PaymentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "payment_details_seq")
    @SequenceGenerator(name="payment_details_seq",sequenceName="PAYMENT_DETAILS_SEQ")
    private int id;
    
    
}

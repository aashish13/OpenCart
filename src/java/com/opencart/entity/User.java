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
import org.hibernate.annotations.Type;

/**
 *
 * @author Aashish
 */
@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "users_seq")
    @SequenceGenerator(name="users_seq",sequenceName="USERS_SEQ")
    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    @Type(type = "true_false")
    private Boolean isAdmin;
    @Type(type = "true_false")
    private Boolean isOms;
    @Type(type = "true_false")
    private Boolean isCms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsOms() {
        return isOms;
    }

    public void setIsOms(Boolean isOms) {
        this.isOms = isOms;
    }

    public Boolean getIsCms() {
        return isCms;
    }

    public void setIsCms(Boolean isCms) {
        this.isCms = isCms;
    }
    
    
   
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aashish
 */
@Repository
public abstract class BaseDao {
    
    @Autowired
    SessionFactory sessionFactory;
    
    protected Session getSesstion(){
        return sessionFactory.getCurrentSession();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.AppConfig;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aashish
 */
@Repository
public class AppConfigDaoImpl implements AppConfigDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void addAppconfig(AppConfig appConfig) {
        getCurrentSession().save(appConfig);
    }
    
    
}

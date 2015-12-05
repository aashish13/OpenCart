/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.AppConfig;
import java.util.List;
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
    public List<AppConfig> listAppconfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAppConfig(AppConfig appConfig) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AppConfig getAppConfigById(int id) {
            AppConfig appConfig=(AppConfig)getCurrentSession().get(AppConfig.class, id);
            return appConfig;
    }
   
    @Override
    public void addAppconfig(AppConfig appConfig) {
        getCurrentSession().save(appConfig);
    }
    
    
}

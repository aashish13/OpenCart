/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.AppConfig;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aashish
 */
public interface AppConfigDao {
    
    public void addAppconfig(AppConfig appConfig);
    public List<AppConfig> listAppconfig();
    public boolean deleteAppConfig(AppConfig appConfig);
    public AppConfig getAppConfigById(int id);
}

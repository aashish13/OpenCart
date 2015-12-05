/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.dao.AppConfigDao;
import com.opencart.entity.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aashish
 */
@Service
@Transactional
public class AppConfigServiceImpl implements AppConfigService{
    @Autowired
    private AppConfigDao appConfigDao;
    @Override
    public void addAppConfig(AppConfig appConfig) {
        appConfigDao.addAppconfig(appConfig);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.AppConfig;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author Aashish
 */
public class AppConfigDao extends HibernateDaoSupport {
    public void create(AppConfig appConf){
        getHibernateTemplate().save(appConf);
    }
    public void update(AppConfig appConf){
        getHibernateTemplate().update(appConf);
    }
    public List<AppConfig> getAll(AppConfig appConf){
        DetachedCriteria criteria=DetachedCriteria.forClass(AppConfig.class);
        return (List<AppConfig>)(Object)getHibernateTemplate().findByCriteria(criteria);
    }
}

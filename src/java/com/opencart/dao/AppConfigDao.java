/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.AppConfig;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aashish
 */
public class AppConfigDao extends BaseDao {
    
    @Transactional
    public List<AppConfig> getAll(){
        Criteria criteria=sessionFactory.getCurrentSession().createCriteria(AppConfig.class);
        List<AppConfig> allAppconfig=criteria.list();
        return allAppconfig;
    }
    
    
}

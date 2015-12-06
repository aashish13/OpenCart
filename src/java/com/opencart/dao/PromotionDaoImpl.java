/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Promotion;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bangalore-pc
 */
@Repository
public class PromotionDaoImpl implements PromotionDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addPromotion(Promotion promotion) {
        getCurrentSession().save(promotion);
    }

    @Override
    public void removePromotion(Promotion promotion) {
        getCurrentSession().delete(promotion);
    }
    
    @SuppressWarnings("unchecked")
    public List<Promotion> getAllPromotions() {
       return getCurrentSession().createQuery("From Promotion").list();
    }
    
}

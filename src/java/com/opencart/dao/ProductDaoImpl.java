/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aashish
 */
@Repository
public class ProductDaoImpl implements ProductDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void add(Product product) {
        getCurrentSession().save(product);
    }

    @Override
    public void remove(Product product) {
        getCurrentSession().delete(product);
    }
    
    @SuppressWarnings("unchecked")
    public List<Product> list() {
       return getCurrentSession().createQuery("From Product").list();
    }
    
}

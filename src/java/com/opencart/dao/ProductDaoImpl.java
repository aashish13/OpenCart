/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Product;
import com.opencart.entity.SubCategory;
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
    public Product getById(int id) {
        Product product=(Product) getCurrentSession().get(Product.class, id);
        return product;
    }
    

    @Override
    public void remove(int id) {
        Product product=getById(id);
        if(product!=null)
            getCurrentSession().delete(product);
    }
    
    @SuppressWarnings("unchecked")
    public List<Product> list() {
       return getCurrentSession().createQuery("From Product").list();
    }
    
}

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
    public Long add(Product product) {
        Long id=(Long)getCurrentSession().save(product);
        return id;
    }
    @Override
    public void update(Product product) {
        getCurrentSession().save(product);
    }

    @Override
    public Product getById(Long product_id) {
        Product product=(Product) getCurrentSession().get(Product.class, product_id);
        return product;
    }
    

    @Override
    public void remove(Long id) {
        Product product=getById(id);
        if(product!=null)
            getCurrentSession().delete(product);
    }
    
    @SuppressWarnings("unchecked")
    public List<Product> list() {
       return getCurrentSession().createQuery("From Product").list();
    }
    
     @SuppressWarnings("unchecked")
    public List<Product> getBySubCategoryId(int id) {
       return getCurrentSession().createQuery("From Product where subCategory = "+id).list();
    }
    
}

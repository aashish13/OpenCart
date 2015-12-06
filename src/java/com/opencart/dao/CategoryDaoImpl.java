/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Category;
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
public class CategoryDaoImpl implements CategoryDao {

    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    
    @Override
    public Category getCategory(int id) {
        Category category=(Category) getCurrentSession().get(Category.class, id);
        return category;
    }
    
    @Override
    public void addCategory(Category category) {
        getCurrentSession().save(category);
    }

    @Override
    public void deleteCategory(int id) {
        Category category =getCategory(id);
        if(category!=null)
            getCurrentSession().delete(category);
    }

    @SuppressWarnings("unchecked")
    public List<Category> list() {
        return getCurrentSession().createQuery("from categories").list();
    }
}

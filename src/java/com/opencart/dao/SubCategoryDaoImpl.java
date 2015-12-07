/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.SubCategory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author esha
 */
@Repository
public class SubCategoryDaoImpl implements SubCategoryDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addSubCategory(SubCategory subcategory) {
        getCurrentSession().save(subcategory);
    }

    @Override
    public void remove(int id) {
        getCurrentSession().delete(id);
    }
    
    @SuppressWarnings("unchecked")
    public List<SubCategory> getAllSubCategory() {
       return getCurrentSession().createQuery("From sub_categories").list();
    }
    
}

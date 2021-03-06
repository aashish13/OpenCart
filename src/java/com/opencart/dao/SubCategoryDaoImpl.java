/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Category;
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

    @Override
    public SubCategory getById(int id) {
        SubCategory subCategory=(SubCategory) getCurrentSession().get(SubCategory.class, id);
        return subCategory;
    }
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
        SubCategory sc=getById(id);
        if(sc!=null)
            getCurrentSession().delete(sc);
    }
    
    @SuppressWarnings("unchecked")
    public List<SubCategory> getAllSubCategory() {
       return getCurrentSession().createQuery("From sub_categories").list();
    }
    
    
}

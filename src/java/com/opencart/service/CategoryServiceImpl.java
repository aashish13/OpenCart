/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.dao.CategoryDao;
import com.opencart.entity.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aashish
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDao categoryDao;
    
    @Override
    public void add(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    public void delete(int id) {
        categoryDao.deleteCategory(id);
    }

    @Override
    public Category get(int id) {
        return categoryDao.getCategory(id);
    }

    @Override
    public List<Category> list() {
        return categoryDao.list();
    }   
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.dao.SubCategoryDao;

import com.opencart.entity.SubCategory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author esha
 */
@Service
@Transactional
public class SubCategoryServiceImpl implements SubCategoryService{
    @Autowired
    private SubCategoryDao subCategoryDao;

    @Override
    public void addSubCategory(SubCategory subcategory) {
        subCategoryDao.addSubCategory(subcategory);
    }
    @Override
    public void remove(int id) {
        subCategoryDao.remove(id);
    }
    @Override
    public List<SubCategory> list() {
        return subCategoryDao.getAllSubCategory();
    }
    @Override
    public SubCategory getById(int id) {
        return subCategoryDao.getById(id);
    }
}
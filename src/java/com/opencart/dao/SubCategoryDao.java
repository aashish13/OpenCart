/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.SubCategory;
import java.util.List;

/**
 *
 * @author Aashish
 */
public interface SubCategoryDao {
       public void addSubCategory(SubCategory subcategory);
    public void remove(int id);
    public List<SubCategory> getAllSubCategory();
 
}

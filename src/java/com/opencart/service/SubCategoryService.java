/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.entity.SubCategory;
import java.util.List;

/**
 *
 * @author esha
 */
public interface SubCategoryService {
     public void addSubCategory(SubCategory subcategory);
    public void removeSubcategory(SubCategory subcategory);
    public List<SubCategory> list();
}

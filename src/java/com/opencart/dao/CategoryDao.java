/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Category;
import java.util.List;

/**
 *
 * @author Aashish
 */
public interface CategoryDao {
    public void addCategory(Category category);
    public void deleteCategory(int id);
    public Category getCategory(int id);
    public List<Category> list();
}

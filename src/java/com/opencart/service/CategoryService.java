/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.entity.Category;
import java.util.List;

/**
 *
 * @author Aashish
 */
public interface CategoryService {
    public void add(Category category);
    public void delete(int id);
    public Category get(int id);
    public List<Category> list();
}

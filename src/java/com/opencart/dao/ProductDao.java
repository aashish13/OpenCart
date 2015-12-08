/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Product;
import java.util.List;
/**
 *
 * @author Bangalore-pc
 */
public interface ProductDao {
    public Long add(Product product);

    public void update(Product product);
    public void remove(Long id);
    public Product getById(Long id);
    public List<Product> list();
    public List<Product> getBySubCategoryId(int id);
    
}

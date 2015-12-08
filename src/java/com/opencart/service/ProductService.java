/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import java.util.List;
import com.opencart.entity.Product;

/**
 *
 * @author Aashish
 */
public interface ProductService {
    public Long add(Product product);
    public void update(Product product);
    public void remove(Long id);
    public Product getById(Long id);
    public List<Product> list();
    public List<Product> getBySubCategoryId(int id);
}

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
    public void add(Product product);
    public void remove(int id);
    public Product getById(int id);
    public List<Product> list();
}

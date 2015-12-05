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
    public void addProduct(Product product);
    public void removeProduct(Product product);
    public List<Product> getAllProducts();
    
}

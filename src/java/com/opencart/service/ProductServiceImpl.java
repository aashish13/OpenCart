/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.dao.ProductDao;
import com.opencart.entity.Product;
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
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public void add(Product product) {
        productDao.add(product);
    }
    @Override
    public void remove(Product product) {
        productDao.remove(product);
    }
    @Override
    public List<Product> list() {
        return productDao.list();
    }
}

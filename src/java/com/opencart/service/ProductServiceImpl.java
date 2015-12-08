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
    public Long add(Product product) {
        return productDao.add(product);
    }
    @Override
    public void remove(Long id) {
        productDao.remove(id);
    }
    @Override
    public Product getById(Long id) {
        return productDao.getById(id);
    }
    @Override
    public List<Product> list() {
        return productDao.list();
    }

    @Override
    public List<Product> getBySubCategoryId(int id) {
        return productDao.getBySubCategoryId(id);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }
}

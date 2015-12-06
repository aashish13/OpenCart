/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.entity.Category;
import com.opencart.entity.Product;
import com.opencart.service.ProductService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Aashish
 */
@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    private ProductService productService;
 @RequestMapping(value = "/products/all")
    public ModelAndView showProductsGet(HttpServletRequest request,HttpServletResponse response){
        List<Product> products=productService.list();
        ModelAndView mv=new ModelAndView("admin/product","products",products);
        return mv;
    }   
}

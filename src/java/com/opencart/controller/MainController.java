/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.service.CategoryService;
import com.opencart.service.SubCategoryService;
import com.opencart.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author Aashish
 */
@Controller
public class MainController {
    @Autowired
    private CategoryService categoryService;
     @Autowired
    private SubCategoryService subcategoryService;
     @Autowired
    private ProductService productService;
     
     
    @RequestMapping(value="/",method=RequestMethod.GET)
    public ModelAndView showIndex(){   
        ModelAndView mv=new ModelAndView("front/index");
        mv.addObject("categories",categoryService.list() );
        mv.addObject("subcategories",subcategoryService.list() );
        return mv;
    }
     @RequestMapping(value="/subcategory",method=RequestMethod.GET)
     public ModelAndView showSubCategory(HttpServletRequest request){   
        ModelAndView mv=new ModelAndView("front/subcategory");
        mv.addObject("subcategories",subcategoryService.list() );
         mv.addObject("categories",categoryService.list() );
           mv.addObject("products",productService.getBySubCategoryId(Integer.parseInt(request.getParameter("id")) )); 
        return mv;
    }
     
     @RequestMapping(value="/product",method=RequestMethod.GET)
     public ModelAndView showProduct(){   
        ModelAndView mv=new ModelAndView("front/product");
        mv.addObject("subcategories",subcategoryService.list() );
         mv.addObject("categories",categoryService.list() );
         mv.addObject("products",productService.list() );
        return mv;
    }
    
}   
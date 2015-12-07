/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.service.CategoryService;
import com.opencart.service.SubCategoryService;
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
     
    @RequestMapping(value="/",method=RequestMethod.GET)
    public ModelAndView showIndex(){   
        ModelAndView mv=new ModelAndView("front/index");
        mv.addObject("categories",categoryService.list() );
        return mv;
    }
     @RequestMapping(value="/addsubcategory",method=RequestMethod.GET)
     public ModelAndView showSubCategory(){   
        ModelAndView mv=new ModelAndView("front/subcategory");
        mv.addObject("subcategories",subcategoryService.list() );
         mv.addObject("categories",categoryService.list() );
        return mv;
    }
    
}
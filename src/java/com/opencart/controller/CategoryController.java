/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.opencart.entity.Category;
import com.opencart.entity.Product;
import com.opencart.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Aashish
 */
@Controller
@RequestMapping("/admin")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(value = "/category",method = RequestMethod.GET)
    public ModelAndView categoryGet(HttpServletRequest request,HttpServletResponse response){
        
        String action=(String)request.getParameter("action");
        if(action.equals("viewall")){
                List<Category> categories=categoryService.list();
                ModelAndView mv=new ModelAndView("admin/category","category",categories);
                return mv;
        }
        
        //show all author
        ModelAndView mv=new ModelAndView("admin/category");
        mv.addObject(new Category());
        return mv;
    }
    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public ModelAndView categoryPost(@Valid @ModelAttribute Category category,BindingResult result){
        //show all author
        return new ModelAndView("admin/category");
    }
            
    
}

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
    
    @RequestMapping(value = "/category/all",method = RequestMethod.GET)
    public ModelAndView categoryGet(HttpServletRequest request,HttpServletResponse response){
        List<Category> categories=categoryService.list();
        ModelAndView mv=new ModelAndView("admin/category","categories",categories);
        return mv;
    }
    
    @RequestMapping(value = "/category/add",method = RequestMethod.GET)
    public ModelAndView addCategory(){
        return new ModelAndView("admin/addcategory","category",new Category());
    }
            
    
    @RequestMapping(value = "/category/add",method = RequestMethod.POST)
    public ModelAndView categoryPost(@Valid @ModelAttribute Category category,BindingResult result,
            HttpServletRequest request,HttpServletResponse response){
        if(result.hasErrors()){
            return new ModelAndView("admin/addcategory");
        }
        else{
            categoryService.add(category);
            String action=(String)request.getParameter("action");
            System.out.println("Action -->"+action);
            List<Category> categories=categoryService.list();
            ModelAndView mv=new ModelAndView("admin/category","categories",categories);
            return mv;
        }
    }
    
    @RequestMapping(value = "/category/delete",method = RequestMethod.GET)
    public ModelAndView deleteCategory(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id").toString());
        categoryService.delete(id);
        List<Category> categories=categoryService.list();
        return new ModelAndView("admin/category","categories",categories);
    }
            
    
}

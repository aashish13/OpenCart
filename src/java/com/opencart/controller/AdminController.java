/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.dao.AppConfigDao;
import com.opencart.entity.*;
import com.opencart.service.AppConfigService;
import com.opencart.service.CategoryService;
import com.opencart.service.ProductService;
import com.opencart.service.SubCategoryService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


/**
 *
 * @author Aashish
 */
@Controller
public class AdminController {
    @Autowired
    private AppConfigService appConfigService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SubCategoryService subcategoryService;
    @Autowired
    private CategoryService categoryService;
    
    
    @RequestMapping(value="/admin",method=RequestMethod.GET)
    public ModelAndView showAdminIndex(){   
        ModelAndView mv=new ModelAndView("admin/index");
        return mv;
    }
    
    @RequestMapping(value="/admin/appconf",method=RequestMethod.GET)
    public ModelAndView showAppConfigGet(HttpServletRequest request,HttpServletResponse response){   
        
        //This is just to test an add using hibernate
        AppConfig appconfig=new AppConfig();
        appconfig.setKey("test");
        appconfig.setValue("test");
        appConfigService.addAppConfig(appconfig);
        
        ModelAndView mv=new ModelAndView("admin/app_config");
        return mv;
    }
    @RequestMapping(value="/admin/appconf",method=RequestMethod.POST)
    public ModelAndView showAppConfigPost(HttpServletRequest request,HttpServletResponse response){  
        
        //Action can be either add or update
        String action=(String)request.getAttribute("action");
        
        ModelAndView mv=new ModelAndView("admin/app_config?action=showone");
        return mv;
    }
    @RequestMapping(value = "/admin/products")
    public ModelAndView showProductsGet(HttpServletRequest request,HttpServletResponse response){
        String action=(String)request.getParameter("action");
        if(action.equals("viewall")){
                List<Product> products=productService.list();
                ModelAndView mv=new ModelAndView("admin/product","products",products);
                return mv;
        }
        else if(action.equals("add")){
            request.setAttribute("action", "add");
            ModelAndView mv=new ModelAndView("admin/product");
            return mv;
        }
        else if(action.equals("delete")){
            
        }
        else if(action.equals("edit")){
            
        }
        return new ModelAndView("admin/product");
    }
@RequestMapping(value = "/admin/subcategory")
    public ModelAndView showSubCategoryGet(HttpServletRequest request,HttpServletResponse response){
        String action=(String)request.getParameter("action");
        if(action.equals("viewall")){
                List<SubCategory> subcategory=subcategoryService.list();
                ModelAndView mv=new ModelAndView("admin/subcategory","subcategory",subcategory);
                return mv;
        }
        else if(action.equals("add")){
            request.setAttribute("action", "add");
            ModelAndView mv=new ModelAndView("admin/subcategory");
            mv.addObject("categories",categoryService.list());
            mv.addObject("subcategory",new SubCategory());
            return mv;
        }
        else if(action.equals("delete")){
            
        }
        else if(action.equals("edit")){
            
        }
        return new ModelAndView("admin/subcategory");
    }    
}

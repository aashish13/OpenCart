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

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;


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
    
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Category.class, "category", new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                if(!text.isEmpty())
                {
                    Category category = (Category) categoryService.get(Integer.parseInt(text));
                    setValue(category);
                }
            }
        });
    }
    
    @RequestMapping(value="/admin",method=RequestMethod.GET)
    public ModelAndView showAdminIndex(){   
        ModelAndView mv=new ModelAndView("admin/index");
        return mv;
    }
    
    @RequestMapping(value="/admin/appconf",method=RequestMethod.GET)
    public ModelAndView showAppConfigGet(HttpServletRequest request,HttpServletResponse response){   
       
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
    
    @RequestMapping(value = "/admin/subcategory/all")
    public ModelAndView showSubCategoryGet(HttpServletRequest request,HttpServletResponse response){
        List<SubCategory> subcategory=subcategoryService.list();
        ModelAndView mv=new ModelAndView("admin/subcategory","subCategory",subcategory);
        return mv;
    }
    @RequestMapping(value = "/admin/subcategory/add",method = RequestMethod.GET)
    public ModelAndView addSubCategory(@ModelAttribute("subCategory") SubCategory subCategory){
        ModelAndView mv=new ModelAndView("admin/addsubcategory");
        mv.addObject("subCategory",subCategory);
        mv.addObject("categories",categoryService.list());
        return mv;
    }
     @RequestMapping(value = "/admin/subcategory/add",method = RequestMethod.POST)
    public ModelAndView categoryPost(@Valid @ModelAttribute("subCategory") SubCategory subCategory,BindingResult result,
            HttpServletRequest request,HttpServletResponse response){
        if(result.hasErrors()){
            return new ModelAndView("admin/addsubcategory","categories",categoryService.list());
        }
        else{
            subcategoryService.addSubCategory(subCategory);
            List<SubCategory> subcategory=subcategoryService.list();
            ModelAndView mv=new ModelAndView("admin/subcategory","subCategory",subcategory);
            return mv;
        }
    }
    @RequestMapping(value = "admin/subcategory/delete",method = RequestMethod.GET)
    public ModelAndView deleteCategory(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id").toString());
        subcategoryService.remove(id);
        List<SubCategory> subcategory=subcategoryService.list();
        ModelAndView mv=new ModelAndView("admin/subcategory","subCategory",subcategory);
        return mv;
    }
}
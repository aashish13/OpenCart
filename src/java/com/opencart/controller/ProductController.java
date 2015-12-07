/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.entity.Category;
import com.opencart.entity.Product;
import com.opencart.entity.SubCategory;
import com.opencart.service.ProductService;
import com.opencart.service.SubCategoryService;
import java.beans.PropertyEditorSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @Autowired
    private SubCategoryService subCategoryService;
    
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(SubCategory.class, "subCategory", new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                if(!text.isEmpty())
                {
                    SubCategory subCategory = (SubCategory) subCategoryService.getById(Integer.parseInt(text));
                    setValue(subCategory);
                }
            }
        });
    }
    
    @RequestMapping(value = "/product/all")
    public ModelAndView showAllProducts(HttpServletRequest request,HttpServletResponse response){
        List<Product> products=productService.list();
        ModelAndView mv=new ModelAndView("admin/product","products",products);
        return mv;
    }
    
    @RequestMapping(value = "/product/add",method = RequestMethod.GET)
    public ModelAndView showAddProductsGet(Product product){
        ModelAndView mv=new ModelAndView("admin/addProducts");
        mv.addObject("subCategories",subCategoryService.list());
        mv.addObject(product);
        return mv;
    }
    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    public ModelAndView showAddProductsPost(@Valid @ModelAttribute("product") Product product,BindingResult result,
            HttpServletRequest request,HttpServletResponse response){
        if(result.hasErrors()){
            return new ModelAndView("admin/addProducts","subCategories",subCategoryService.list());
        }
        else{
            productService.add(product);
            List<Product> products=productService.list();
            ModelAndView mv=new ModelAndView("admin/product","products",products);
            return mv;
        }
    }
    @RequestMapping(value = "admin/product/delete",method = RequestMethod.GET)
    public ModelAndView deleteCategory(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id").toString());
        productService.remove(id);
        List<Product> subcategory=productService.list();
        ModelAndView mv=new ModelAndView("admin/subcategory","subCategory",subcategory);
        return mv;
    }
}

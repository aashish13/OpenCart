/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.entity.Product;
import com.opencart.entity.SubCategory;
import com.opencart.service.ProductService;
import com.opencart.service.SubCategoryService;
import java.beans.PropertyEditorSupport;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
            Long product_id=productService.add(product);
            //List<Product> products=productService.list();
            ModelAndView mv=new ModelAndView("admin/addProductImage");
            mv.addObject("id",product_id);
            return mv;
        }
    }
    
    
    @RequestMapping(value="/product/upload", method=RequestMethod.POST)
    public @ResponseBody ModelAndView handleFileUpload(@RequestParam("id") String id,
            @RequestParam("file") MultipartFile image,HttpServletRequest request){
        if (!image.isEmpty()) {
            try {
                File file = new File("c:/uploads/products/"+ id+"/"+image.getOriginalFilename());
                
                FileUtils.writeByteArrayToFile(file, image.getBytes());
                Product product=productService.getById(Long.parseLong(id));
                product.setImg(file.getName());
                productService.update(product);
                                            
                List<Product> products=productService.list();
                ModelAndView mv=new ModelAndView("admin/product","products",products);
                return mv;
                
            } catch (Exception e) {
                ModelAndView mv=new ModelAndView("admin/addProductImage");
                mv.addObject("id",id);
                return mv;
            }
        } else {
            ModelAndView mv=new ModelAndView("admin/addProductImage");
            mv.addObject("id",id);
            return mv;
        }
    }
    
    @RequestMapping(value = "/product/delete",method = RequestMethod.GET)
    public ModelAndView deleteCategory(HttpServletRequest request) throws IOException{
        Long id=Long.parseLong(request.getParameter("id").toString());
        Product product=productService.getById(id);
        File file = new File("c:/uploads/products/"+ id);
        product.setImg(file.getName());
        FileUtils.deleteDirectory(file);
        productService.remove(id);
        List<Product> products=productService.list();
        ModelAndView mv=new ModelAndView("admin/product","products",products);
        return mv;
    }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

import com.opencart.dao.AppConfigDao;
import com.opencart.entity.*;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    @RequestMapping(value="/admin",method=RequestMethod.GET)
    public ModelAndView showAdminIndex(){   
        ModelAndView mv=new ModelAndView("admin/index");
        return mv;
    }
    @RequestMapping(value="/admin/appconf",method=RequestMethod.GET)
    public ModelAndView showAppConfigGet(HttpServletRequest request,HttpServletResponse response){   
        //get all the rows from app_config table
        //List<AppConfig> list=new AppConfigDao().getAll();
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
}

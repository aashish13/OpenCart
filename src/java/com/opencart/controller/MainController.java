/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.controller;

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
    @RequestMapping(value="/",method=RequestMethod.GET)
    public ModelAndView showIndex(){   
        ModelAndView mv=new ModelAndView("main/index");
        return mv;
    }
}
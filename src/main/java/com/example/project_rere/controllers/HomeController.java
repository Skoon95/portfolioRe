package com.example.project_rere.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "/",
    method = RequestMethod.GET)
    public ModelAndView getProject(){
        ModelAndView modelAndView = new ModelAndView("home/project");
        return modelAndView;
    }

    @RequestMapping(value = "/test",
    method = RequestMethod.GET)
    public ModelAndView getTest(){
        ModelAndView modelAndView = new ModelAndView("home/test");
        return modelAndView;
    }

}

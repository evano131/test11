package com.telent.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/index"})
public class IndexController {

    @RequestMapping(value = {"/","/index"})
    public String index(){
        return "index/index";
    }

    @RequestMapping(value = {"/","/home"})
    public String home(){
        return "index/home";
    }
}

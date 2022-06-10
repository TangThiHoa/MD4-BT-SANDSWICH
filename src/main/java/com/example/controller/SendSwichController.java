package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.Service;

@Controller
public class SendSwichController {
    @GetMapping ("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/save")
    public String save(@RequestParam ("condiment")String[]condiment, Model model){
        model.addAttribute("result",condiment);
        return "save";

    }

}

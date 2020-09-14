package com.example.devops.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neeraj Joshi
 * @since 8/9/2019
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
}

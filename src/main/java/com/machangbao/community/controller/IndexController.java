package com.machangbao.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * .
 * Created by mcbbugu
 * 2019-09-08 00:13
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
package com.machangbao.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * .
 * Created by mcbbugu
 * 2019-09-10 00:03
 */
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
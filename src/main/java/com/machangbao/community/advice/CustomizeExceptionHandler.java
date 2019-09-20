package com.machangbao.community.advice;

import com.machangbao.community.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * .
 * Created by mcbbugu
 * 2019-09-17 22:27
 */
@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    ModelAndView handle(HttpServletRequest request, Throwable e, Model model) {
        if(e instanceof CustomizeException){
            model.addAttribute("message", e.getMessage());
        }else {
            System.out.println(e.getMessage());
            model.addAttribute("message", "服务冒烟了");
        }
        return new ModelAndView("error");
    }
}
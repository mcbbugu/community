package com.machangbao.community.controller;

import com.machangbao.community.dto.QuestionDTO;
import com.machangbao.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * .
 * Created by mcbbugu
 * 2019-09-14 18:10
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService QuestionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
        QuestionDTO questionDTO = QuestionService.getById(id);
        //累加阅读数
        QuestionService.incView(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
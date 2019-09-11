package com.codegym.controller;

import com.codegym.repository.impl.CaculatorRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    CaculatorRepositoryImpl caculator = new CaculatorRepositoryImpl();
    @RequestMapping(value = "/form")
    public String show(Model model){
        return "/form";
    }

    @RequestMapping(value = "/result")
    public String result(@RequestParam("usd") float usd,Model model){
        float result = caculator.converter(usd);
        model.addAttribute("result",result);
        return "/result";
    }

}

package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author LYF
 * @Date 2021/1/7 下午 1:05
 * @Version 1.0
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf1.do")
    public String thymeleaf1(Model model) {
        model.addAttribute("data", "SpringBoot Thymeleaf");
        return "index";
    }

    @RequestMapping("/thymeleaf2.do")
    public ModelAndView thymeleaf2() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("data", "SpringBoot Thymeleaf");
        mv.setViewName("index");
        return mv;
    }
}

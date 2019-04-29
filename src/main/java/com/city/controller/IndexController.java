package com.city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: 首页控制
 * @DATE: 2018-05-17 15:54
 * @throws
 */

@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(HttpServletResponse response, HttpServletRequest request, ModelAndView modelAndView){
        System.out.println("+++++++++++++++");
        System.out.println("_________________");
        System.out.println("2324234234232423");
        return "index";
    }

}

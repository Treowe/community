package com.tong.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: TONG
 * @date: Created in 2019/11/15 22:32
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
































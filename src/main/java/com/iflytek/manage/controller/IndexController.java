package com.iflytek.manage.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * sssss
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String indexUI(){
        return "index";
    }

    @RequestMapping("/testJson")
    @ResponseBody
    public String testJson(){
        return "testJson 哈哈";
    }

}

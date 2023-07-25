package com.freecode.findLove.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/ok")
    public String test(){
        return "success";
    }

    @GetMapping("error")
    public void error(){
        throw new RuntimeException("自定义异常");
    }
}

package com.cn.zyd.demo.web.controller;

import com.cn.zyd.demo.web.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @Value("${nickName}")
//    private String port;
    @Autowired
    private TestBean testBean;

    @RequestMapping("aa")
    public String aa(){

        return "aa";
    }
}

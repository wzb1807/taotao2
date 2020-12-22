package com.ithezebin.controller;


import com.ithezebin.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/say")
    public String sayHi(){

        testService.sayHi();
        return "<div style=\"width:300px;margin:100px auto;\"><h1 style=\"color:skyblue;font-size:80px;\">success~~</h1></div>";

    }
}

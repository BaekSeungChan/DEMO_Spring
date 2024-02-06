package com.qortmdcks.demo.controller;

import com.qortmdcks.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
//@RequiredArgsConstructor
@RequestMapping("/api")
public class
HelloController {

//    @Autowired
//    private final HelloService helloService;
    HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    } // @Autowired 보다 이렇게 생성자 주입으로 넣는게 추천함

    @GetMapping("/hello")
//    @ResponseBody
    public String hello(){
        return helloService.printHello();
    }
}

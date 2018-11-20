package com.cbs.app.controller;

import com.cbs.app.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("index")
    public String index(){
        return demoService.getDemoString();
    }
}

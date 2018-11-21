package com.cbs.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cbs.app.entity.Country;
import com.cbs.app.service.CountryService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

    @Reference
    private CountryService countryService;

    @GetMapping("/getCountrys")
    @ResponseBody
    public PageInfo<Country> getCountrys(int pageNum , int pageSize){
        return countryService.getCountrys(new Country(),pageNum,pageSize);
    }
}

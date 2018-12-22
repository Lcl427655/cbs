package com.cbs.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cbs.app.entity.HrefInfo;
import com.cbs.app.service.HrefInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = {"http://localhost:8080", "null"})
public class HrefInfoController {

    @Reference
    private HrefInfoService hrefInfoService;

    @GetMapping("/getHrefInfos")
    @ResponseBody
    public PageInfo<HrefInfo> getHrefInfos(@RequestParam(value = "pageNum") int pageNum ,
                                          @RequestParam(value = "pageSize") int pageSize){
        return hrefInfoService.getHrefInfos(new HrefInfo(),pageNum,pageSize);
    }
}

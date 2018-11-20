package com.cbs.app.controller;

import com.cbs.app.dao.FbpEmployeesMapper;
import com.cbs.app.dao.WfrBillHistoriesMapper;
import com.cbs.app.entity.FbpEmployees;
import com.cbs.app.entity.WfrBillHistories;
import com.cbs.app.entity.WfrBillHistoriesExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class FbpEmployeesController {

    @Autowired
    private FbpEmployeesMapper fbpEmployeesMapper;

    @Autowired
    private WfrBillHistoriesMapper wfrBillHistoriesMapper;


    @GetMapping("/emp")
    @ResponseBody
    public String selectByPrimaryKey(){
        FbpEmployees fbpEmployees = fbpEmployeesMapper.selectByPrimaryKey((long) 1);
        return new Gson().toJson(fbpEmployees);
    }

    @ResponseBody
    @GetMapping("/wfr")
    public PageInfo<WfrBillHistories> getWfrBillHistories(){
        PageHelper.startPage(1, 3);
        WfrBillHistoriesExample wfrBillHistoriesExample = new WfrBillHistoriesExample();
        WfrBillHistoriesExample.Criteria criteria = wfrBillHistoriesExample.createCriteria();
        criteria.andWfDefiniensIdEqualTo((long)119891);
        List<WfrBillHistories> list = wfrBillHistoriesMapper.selectByExample(wfrBillHistoriesExample);
        PageInfo<WfrBillHistories> pages=new PageInfo<>(list,1);
        System.out.println("pages.getTotal() = " + pages.getTotal());
        return pages;
    }
}

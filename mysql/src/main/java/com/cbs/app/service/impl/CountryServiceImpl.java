package com.cbs.app.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cbs.app.entity.Country;
import com.cbs.app.entity.CountryExample;
import com.cbs.app.mapper.CountryMapper;
import com.cbs.app.service.CountryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Service
@Component//以这个注解代替service加入Spring容器
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CountryExample countryExample;

    public PageInfo<Country> getCountrys(Country country,int pageNum ,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        //CountryExample countryExample = new CountryExample();
        CountryExample.Criteria criteria1 = countryExample.createCriteria();
        //条件
        // criteria1
        List<Country> countries = countryMapper.selectByExample(countryExample);
        PageInfo<Country> pages=new PageInfo<>(countries);
        return pages;
    }
}

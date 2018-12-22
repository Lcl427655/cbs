package com.cbs.app.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cbs.app.entity.Country;
import com.cbs.app.entity.CountryExample;
import com.cbs.app.entity.HrefInfo;
import com.cbs.app.entity.HrefInfoExample;
import com.cbs.app.mapper.CountryMapper;
import com.cbs.app.mapper.HrefInfoMapper;
import com.cbs.app.service.CountryService;
import com.cbs.app.service.HrefInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component//以这个注解代替service加入Spring容器
public class HrefInfoServiceImpl implements HrefInfoService {

    @Autowired
    private HrefInfoMapper hrefInfoMapper;

    @Autowired
    private HrefInfoExample hrefInfoExample;

    @Override
    public PageInfo<HrefInfo> getHrefInfos(HrefInfo hrefInfo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //HrefInfoExample.Criteria criteria1 = hrefInfoExample.createCriteria();
        //条件
        // criteria1
        List<HrefInfo> hrefInfos = hrefInfoMapper.selectByExample(hrefInfoExample);
        PageInfo<HrefInfo> pages=new PageInfo<>(hrefInfos);
        return pages;
    }
}

package com.cbs.app.service.impl;

import com.cbs.app.service.DemoService;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component //这个必须要加
public class DemoServiceImpl implements DemoService {

    @Override
    public String getDemoString() {
        return "Hello Dubbo!";
    }

}

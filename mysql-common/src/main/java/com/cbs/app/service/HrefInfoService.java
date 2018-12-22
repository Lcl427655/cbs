package com.cbs.app.service;

import com.cbs.app.entity.Country;
import com.cbs.app.entity.HrefInfo;
import com.github.pagehelper.PageInfo;

public interface HrefInfoService {
    PageInfo<HrefInfo> getHrefInfos(HrefInfo hrefInfo, int pageNum, int pageSize);
}

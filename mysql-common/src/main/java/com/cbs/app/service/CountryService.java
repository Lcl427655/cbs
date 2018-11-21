package com.cbs.app.service;

import com.cbs.app.entity.Country;
import com.github.pagehelper.PageInfo;

public interface CountryService {
    PageInfo<Country> getCountrys(Country country, int pageNum , int pageSize);
}

package com.cbs.app.dao;

import com.cbs.app.entity.FbpEmployees;

public interface FbpEmployeesMapper {
    int deleteByPrimaryKey(Long employeeId);

    int insert(FbpEmployees record);

    int insertSelective(FbpEmployees record);

    FbpEmployees selectByPrimaryKey(Long employeeId);

    int updateByPrimaryKeySelective(FbpEmployees record);

    int updateByPrimaryKey(FbpEmployees record);
}
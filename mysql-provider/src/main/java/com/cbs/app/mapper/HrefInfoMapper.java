package com.cbs.app.mapper;

import com.cbs.app.entity.HrefInfo;
import com.cbs.app.entity.HrefInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrefInfoMapper {
    int countByExample(HrefInfoExample example);

    int deleteByExample(HrefInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HrefInfo record);

    int insertSelective(HrefInfo record);

    List<HrefInfo> selectByExample(HrefInfoExample example);

    HrefInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrefInfo record, @Param("example") HrefInfoExample example);

    int updateByExample(@Param("record") HrefInfo record, @Param("example") HrefInfoExample example);

    int updateByPrimaryKeySelective(HrefInfo record);

    int updateByPrimaryKey(HrefInfo record);
}
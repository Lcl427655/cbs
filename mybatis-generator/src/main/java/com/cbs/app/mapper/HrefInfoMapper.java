package com.cbs.app.mapper;

import com.cbs.app.entity.HrefInfo;
import com.cbs.app.entity.HrefInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
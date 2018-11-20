package com.cbs.app.dao;

import com.cbs.app.entity.WfrBillHistories;
import com.cbs.app.entity.WfrBillHistoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfrBillHistoriesMapper {
    int countByExample(WfrBillHistoriesExample example);

    int deleteByExample(WfrBillHistoriesExample example);

    int deleteByPrimaryKey(Long wfHistoriesId);

    int insert(WfrBillHistories record);

    int insertSelective(WfrBillHistories record);

    List<WfrBillHistories> selectByExample(WfrBillHistoriesExample example);

    WfrBillHistories selectByPrimaryKey(Long wfHistoriesId);

    int updateByExampleSelective(@Param("record") WfrBillHistories record, @Param("example") WfrBillHistoriesExample example);

    int updateByExample(@Param("record") WfrBillHistories record, @Param("example") WfrBillHistoriesExample example);

    int updateByPrimaryKeySelective(WfrBillHistories record);

    int updateByPrimaryKey(WfrBillHistories record);
}
package com.pes.jd.mapper;

import com.pes.jd.model.DO.CsTypeDay;
import com.pes.jd.model.DO.CsTypeDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsTypeDayMapper {
    long countByExample(CsTypeDayExample example);

    int deleteByExample(CsTypeDayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CsTypeDay record);

    int insertSelective(CsTypeDay record);

    List<CsTypeDay> selectByExample(CsTypeDayExample example);

    CsTypeDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CsTypeDay record, @Param("example") CsTypeDayExample example);

    int updateByExample(@Param("record") CsTypeDay record, @Param("example") CsTypeDayExample example);

    int updateByPrimaryKeySelective(CsTypeDay record);

    int updateByPrimaryKey(CsTypeDay record);
}
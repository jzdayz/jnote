package com.pes.jd.mapper;

import com.pes.jd.model.DO.ReportProperty;
import com.pes.jd.model.DO.ReportPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportPropertyMapper {
    long countByExample(ReportPropertyExample example);

    int deleteByExample(ReportPropertyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReportProperty record);

    int insertSelective(ReportProperty record);

    List<ReportProperty> selectByExample(ReportPropertyExample example);

    ReportProperty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReportProperty record, @Param("example") ReportPropertyExample example);

    int updateByExample(@Param("record") ReportProperty record, @Param("example") ReportPropertyExample example);

    int updateByPrimaryKeySelective(ReportProperty record);

    int updateByPrimaryKey(ReportProperty record);
}
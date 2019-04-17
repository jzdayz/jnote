package com.pes.jd.mapper;

import com.pes.jd.model.DO.PesReportProperty;
import com.pes.jd.model.DO.PesReportPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PesReportPropertyMapper {
    long countByExample(PesReportPropertyExample example);

    int deleteByExample(PesReportPropertyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PesReportProperty record);

    int insertSelective(PesReportProperty record);

    List<PesReportProperty> selectByExample(PesReportPropertyExample example);

    PesReportProperty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PesReportProperty record, @Param("example") PesReportPropertyExample example);

    int updateByExample(@Param("record") PesReportProperty record, @Param("example") PesReportPropertyExample example);

    int updateByPrimaryKeySelective(PesReportProperty record);

    int updateByPrimaryKey(PesReportProperty record);
}
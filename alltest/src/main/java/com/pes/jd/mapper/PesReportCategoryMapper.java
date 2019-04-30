package com.pes.jd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pes.jd.model.DO.PesReportCategory;
import com.pes.jd.model.DO.PesReportCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface PesReportCategoryMapper extends BaseMapper<PesReportCategory> {
    long countByExample(PesReportCategoryExample example);

    int deleteByExample(PesReportCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PesReportCategory record);

    int insertSelective(PesReportCategory record);

    List<PesReportCategory> selectByExample(PesReportCategoryExample example);

    PesReportCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PesReportCategory record, @Param("example") PesReportCategoryExample example);

    int updateByExample(@Param("record") PesReportCategory record, @Param("example") PesReportCategoryExample example);

    int updateByPrimaryKeySelective(PesReportCategory record);

    int updateByPrimaryKey(PesReportCategory record);
}
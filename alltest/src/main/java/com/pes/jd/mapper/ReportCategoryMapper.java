package com.pes.jd.mapper;

import com.pes.jd.model.DO.ReportCategory;
import com.pes.jd.model.DO.ReportCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportCategoryMapper {
    long countByExample(ReportCategoryExample example);

    int deleteByExample(ReportCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReportCategory record);

    int insertSelective(ReportCategory record);

    List<ReportCategory> selectByExample(ReportCategoryExample example);

    ReportCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReportCategory record, @Param("example") ReportCategoryExample example);

    int updateByExample(@Param("record") ReportCategory record, @Param("example") ReportCategoryExample example);

    int updateByPrimaryKeySelective(ReportCategory record);

    int updateByPrimaryKey(ReportCategory record);
}
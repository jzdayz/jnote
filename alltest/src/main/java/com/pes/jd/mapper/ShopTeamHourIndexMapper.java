package com.pes.jd.mapper;

import com.pes.jd.model.DO.ShopTeamHourIndex;
import com.pes.jd.model.DO.ShopTeamHourIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopTeamHourIndexMapper {
    long countByExample(ShopTeamHourIndexExample example);

    int deleteByExample(ShopTeamHourIndexExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopTeamHourIndex record);

    int insertSelective(ShopTeamHourIndex record);

    List<ShopTeamHourIndex> selectByExample(ShopTeamHourIndexExample example);

    ShopTeamHourIndex selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopTeamHourIndex record, @Param("example") ShopTeamHourIndexExample example);

    int updateByExample(@Param("record") ShopTeamHourIndex record, @Param("example") ShopTeamHourIndexExample example);

    int updateByPrimaryKeySelective(ShopTeamHourIndex record);

    int updateByPrimaryKey(ShopTeamHourIndex record);
}
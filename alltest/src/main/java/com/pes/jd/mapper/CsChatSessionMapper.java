package com.pes.jd.mapper;

import com.pes.jd.model.DO.CsChatSession;
import com.pes.jd.model.DO.CsChatSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsChatSessionMapper extends BaseMapper<CsChatSession> {
    long countByExample(CsChatSessionExample example);

    int deleteByExample(CsChatSessionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CsChatSession record);

    int insertSelective(CsChatSession record);

    List<CsChatSession> selectByExample(CsChatSessionExample example);

    CsChatSession selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CsChatSession record, @Param("example") CsChatSessionExample example);

    int updateByExample(@Param("record") CsChatSession record, @Param("example") CsChatSessionExample example);

    int updateByPrimaryKeySelective(CsChatSession record);

    int updateByPrimaryKey(CsChatSession record);
}
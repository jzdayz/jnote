package com.pes.jd.mapper;

import com.pes.jd.model.DO.pes_cs_chat_session;
import com.pes.jd.model.DO.pes_cs_chat_sessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pes_cs_chat_sessionMapper {
    long countByExample(pes_cs_chat_sessionExample example);

    int deleteByExample(pes_cs_chat_sessionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(pes_cs_chat_session record);

    int insertSelective(pes_cs_chat_session record);

    List<pes_cs_chat_session> selectByExample(pes_cs_chat_sessionExample example);

    pes_cs_chat_session selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") pes_cs_chat_session record, @Param("example") pes_cs_chat_sessionExample example);

    int updateByExample(@Param("record") pes_cs_chat_session record, @Param("example") pes_cs_chat_sessionExample example);

    int updateByPrimaryKeySelective(pes_cs_chat_session record);

    int updateByPrimaryKey(pes_cs_chat_session record);
}
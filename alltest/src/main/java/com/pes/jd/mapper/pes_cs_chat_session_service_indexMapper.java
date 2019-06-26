package com.pes.jd.mapper;

import com.pes.jd.model.DO.pes_cs_chat_session_service_index;
import com.pes.jd.model.DO.pes_cs_chat_session_service_indexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pes_cs_chat_session_service_indexMapper {
    long countByExample(pes_cs_chat_session_service_indexExample example);

    int deleteByExample(pes_cs_chat_session_service_indexExample example);

    int deleteByPrimaryKey(Long id);

    int insert(pes_cs_chat_session_service_index record);

    int insertSelective(pes_cs_chat_session_service_index record);

    List<pes_cs_chat_session_service_index> selectByExample(pes_cs_chat_session_service_indexExample example);

    pes_cs_chat_session_service_index selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") pes_cs_chat_session_service_index record, @Param("example") pes_cs_chat_session_service_indexExample example);

    int updateByExample(@Param("record") pes_cs_chat_session_service_index record, @Param("example") pes_cs_chat_session_service_indexExample example);

    int updateByPrimaryKeySelective(pes_cs_chat_session_service_index record);

    int updateByPrimaryKey(pes_cs_chat_session_service_index record);
}
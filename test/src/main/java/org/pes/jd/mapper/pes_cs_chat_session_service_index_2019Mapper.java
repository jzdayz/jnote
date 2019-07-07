package org.pes.jd.mapper;

import org.pes.jd.model.DO.pes_cs_chat_session_service_index_2019;
import org.pes.jd.model.DO.pes_cs_chat_session_service_index_2019Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pes_cs_chat_session_service_index_2019Mapper {
    long countByExample(pes_cs_chat_session_service_index_2019Example example);

    int deleteByExample(pes_cs_chat_session_service_index_2019Example example);

    int deleteByPrimaryKey(Long id);

    int insert(pes_cs_chat_session_service_index_2019 record);

    int insertSelective(pes_cs_chat_session_service_index_2019 record);

    List<pes_cs_chat_session_service_index_2019> selectByExample(pes_cs_chat_session_service_index_2019Example example);

    pes_cs_chat_session_service_index_2019 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") pes_cs_chat_session_service_index_2019 record, @Param("example") pes_cs_chat_session_service_index_2019Example example);

    int updateByExample(@Param("record") pes_cs_chat_session_service_index_2019 record, @Param("example") pes_cs_chat_session_service_index_2019Example example);

    int updateByPrimaryKeySelective(pes_cs_chat_session_service_index_2019 record);

    int updateByPrimaryKey(pes_cs_chat_session_service_index_2019 record);
}
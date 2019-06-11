package com.pes.jd.mapper;

import com.pes.jd.model.DO.CsChatSessionServiceIndexTempDO;

import java.util.List;

public interface CsChatSessionServiceIndexTempMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CsChatSessionServiceIndexTempDO record);

    int insertSelective(CsChatSessionServiceIndexTempDO record);

    CsChatSessionServiceIndexTempDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CsChatSessionServiceIndexTempDO record);

    int updateByPrimaryKey(CsChatSessionServiceIndexTempDO record);
}
package com.pes.jd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pes.jd.model.DO.PesMenuResource;
import com.pes.jd.model.DO.PesMenuResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PesMenuResourceMapper extends BaseMapper<PesMenuResource> {
    long countByExample(PesMenuResourceExample example);

    int deleteByExample(PesMenuResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PesMenuResource record);

    int insertSelective(PesMenuResource record);

    List<PesMenuResource> selectByExample(PesMenuResourceExample example);

    PesMenuResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PesMenuResource record, @Param("example") PesMenuResourceExample example);

    int updateByExample(@Param("record") PesMenuResource record, @Param("example") PesMenuResourceExample example);

    int updateByPrimaryKeySelective(PesMenuResource record);

    int updateByPrimaryKey(PesMenuResource record);
}
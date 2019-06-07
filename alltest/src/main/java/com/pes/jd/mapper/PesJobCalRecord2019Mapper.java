package com.pes.jd.mapper;

import com.pes.jd.model.DO.PesJobCalRecord2019;
import com.pes.jd.model.DO.PesJobCalRecord2019Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PesJobCalRecord2019Mapper {
    long countByExample(PesJobCalRecord2019Example example);

    int deleteByExample(PesJobCalRecord2019Example example);

    int deleteByPrimaryKey(Long id);

    int insert(PesJobCalRecord2019 record);

    int insertSelective(PesJobCalRecord2019 record);

    List<PesJobCalRecord2019> selectByExample(PesJobCalRecord2019Example example);

    PesJobCalRecord2019 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PesJobCalRecord2019 record, @Param("example") PesJobCalRecord2019Example example);

    int updateByExample(@Param("record") PesJobCalRecord2019 record, @Param("example") PesJobCalRecord2019Example example);

    int updateByPrimaryKeySelective(PesJobCalRecord2019 record);

    int updateByPrimaryKey(PesJobCalRecord2019 record);
}
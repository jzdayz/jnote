package com.pes.jd.mapper;

import com.pes.jd.model.DO.PesJobPullRecord2019;
import com.pes.jd.model.DO.PesJobPullRecord2019Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PesJobPullRecord2019Mapper {
    long countByExample(PesJobPullRecord2019Example example);

    int deleteByExample(PesJobPullRecord2019Example example);

    int deleteByPrimaryKey(Long id);

    int insert(PesJobPullRecord2019 record);

    int insertSelective(PesJobPullRecord2019 record);

    List<PesJobPullRecord2019> selectByExample(PesJobPullRecord2019Example example);

    PesJobPullRecord2019 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PesJobPullRecord2019 record, @Param("example") PesJobPullRecord2019Example example);

    int updateByExample(@Param("record") PesJobPullRecord2019 record, @Param("example") PesJobPullRecord2019Example example);

    int updateByPrimaryKeySelective(PesJobPullRecord2019 record);

    int updateByPrimaryKey(PesJobPullRecord2019 record);
}
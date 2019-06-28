package com.pes.jd.mapper;

import com.pes.jd.model.DO.pes_shop_account;
import com.pes.jd.model.DO.pes_shop_accountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pes_shop_accountMapper {
    long countByExample(pes_shop_accountExample example);

    int deleteByExample(pes_shop_accountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(pes_shop_account record);

    int insertSelective(pes_shop_account record);

    List<pes_shop_account> selectByExample(pes_shop_accountExample example);

    pes_shop_account selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") pes_shop_account record, @Param("example") pes_shop_accountExample example);

    int updateByExample(@Param("record") pes_shop_account record, @Param("example") pes_shop_accountExample example);

    int updateByPrimaryKeySelective(pes_shop_account record);

    int updateByPrimaryKey(pes_shop_account record);
}
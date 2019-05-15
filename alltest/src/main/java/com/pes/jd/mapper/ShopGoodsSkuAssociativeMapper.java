package com.pes.jd.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.pes.jd.model.DO.ShopGoodsSkuAssociativeDO;

import java.util.List;

import com.pes.jd.model.DTO.ShopGoodsSkuAssociativeDTO;
import org.apache.ibatis.annotations.Param;

public interface ShopGoodsSkuAssociativeMapper  extends BaseMapper<ShopGoodsSkuAssociativeDTO> {

    int deleteByPrimaryKey(Long id);

    int insert(ShopGoodsSkuAssociativeDO record);

    int insertSelective(ShopGoodsSkuAssociativeDO record);

    ShopGoodsSkuAssociativeDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopGoodsSkuAssociativeDO record);

    int updateByPrimaryKey(ShopGoodsSkuAssociativeDO record);

}
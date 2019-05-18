package com.pes.jd.mapper;

import com.pes.jd.model.DO.ShopGoodsSkuLabelDO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopGoodsSkuLabelMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ShopGoodsSkuLabelDO record);

    int insertSelective(ShopGoodsSkuLabelDO record);

    ShopGoodsSkuLabelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopGoodsSkuLabelDO record);

    int updateByPrimaryKey(ShopGoodsSkuLabelDO record);
}
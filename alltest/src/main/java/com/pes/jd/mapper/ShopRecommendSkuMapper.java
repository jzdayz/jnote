package com.pes.jd.mapper;

import com.pes.jd.model.DO.ShopRecommendSkuDO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopRecommendSkuMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ShopRecommendSkuDO record);

    int insertSelective(ShopRecommendSkuDO record);

    ShopRecommendSkuDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopRecommendSkuDO record);

    int updateByPrimaryKey(ShopRecommendSkuDO record);
}
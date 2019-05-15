package com.pes.jd.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface BiBaseMapper<T,K> {

    String TABLE_NAME = "tableName";
    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    int insert(T entity,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    int deleteById(Serializable id, @Param(TABLE_NAME) String tableName);

    /**
     * 根据 columnMap 条件，删除记录
     *
     * @param columnMap 表字段 map 对象
     */
    int deleteByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap, @Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，删除记录
     *
     * @param wrapper 实体对象封装操作类（可以为 null）
     */
    int delete(@Param(Constants.WRAPPER) Wrapper<T> wrapper, @Param(TABLE_NAME) String tableName);

    /**
     * 删除（根据ID 批量删除）
     *
     * @param idList 主键ID列表(不能为 null 以及 empty)
     */
    int deleteBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList, @Param(TABLE_NAME) String tableName);

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    int updateById(@Param(Constants.ENTITY) T entity,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 whereEntity 条件，更新记录
     *
     * @param entity        实体对象 (set 条件值,可以为 null)
     * @param updateWrapper 实体对象封装操作类（可以为 null,里面的 entity 用于生成 where 语句）
     */
    int update(@Param(Constants.ENTITY) T entity, @Param(Constants.WRAPPER) Wrapper<T> updateWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    T selectById(Serializable id,@Param(TABLE_NAME) String tableName);

    /**
     * 查询（根据ID 批量查询）
     *
     * @param idList 主键ID列表(不能为 null 以及 empty)
     */
    List<T> selectBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList, @Param(TABLE_NAME) String tableName);

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     */
    List<T> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，查询一条记录
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    T selectOne(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询总记录数
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    Integer selectCount(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，查询全部记录
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<T> selectList(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询全部记录
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<Map<String, Object>> selectMaps(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询全部记录
     * <p>注意： 只返回第一个字段的值</p>
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<Object> selectObjs(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，查询全部记录（并翻页）
     *
     * @param page         分页查询条件（可以为 RowBounds.DEFAULT）
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    IPage<T> selectPage(IPage<T> page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper, @Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询全部记录（并翻页）
     *
     * @param page         分页查询条件
     * @param queryWrapper 实体对象封装操作类
     */
    IPage<Map<String, Object>> selectMapsPage(IPage<T> page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper,@Param(TABLE_NAME) String tableName);




    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    int insertK(K entity,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，删除记录
     *
     * @param wrapper 实体对象封装操作类（可以为 null）
     */
    int deleteK(@Param(Constants.WRAPPER) Wrapper<K> wrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    int updateByIdK(@Param(Constants.ENTITY) K entity,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 whereEntity 条件，更新记录
     *
     * @param entity        实体对象 (set 条件值,可以为 null)
     * @param updateWrapper 实体对象封装操作类（可以为 null,里面的 entity 用于生成 where 语句）
     */
    int updateK(@Param(Constants.ENTITY) K entity, @Param(Constants.WRAPPER) Wrapper<K> updateWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    K selectByIdK(Serializable id,@Param(TABLE_NAME) String tableName);

    /**
     * 查询（根据ID 批量查询）
     *
     * @param idList 主键ID列表(不能为 null 以及 empty)
     */
    List<K> selectBatchIdsK(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList,@Param(TABLE_NAME) String tableName);

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     */
    List<K> selectByMapK(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，查询一条记录
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    K selectOneK(@Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询总记录数
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    Integer selectCountK(@Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，查询全部记录
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<K> selectListK(@Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询全部记录
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<Map<String, Object>> selectMapsK(@Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询全部记录
     * <p>注意： 只返回第一个字段的值</p>
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    List<Object> selectObjsK(@Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 entity 条件，查询全部记录（并翻页）
     *
     * @param page         分页查询条件（可以为 RowBounds.DEFAULT）
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    IPage<K> selectPageK(IPage<K> page, @Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);

    /**
     * 根据 Wrapper 条件，查询全部记录（并翻页）
     *
     * @param page         分页查询条件
     * @param queryWrapper 实体对象封装操作类
     */
    IPage<Map<String, Object>> selectMapsPageK(IPage<K> page, @Param(Constants.WRAPPER) Wrapper<K> queryWrapper,@Param(TABLE_NAME) String tableName);
}

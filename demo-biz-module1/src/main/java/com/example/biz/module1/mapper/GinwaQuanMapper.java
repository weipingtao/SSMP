package com.example.biz.module1.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.biz.module1.entity.GinwaQuanEntity;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GinwaQuanMapper extends BaseMapper<GinwaQuanEntity> {
    @Override
    Integer insert(GinwaQuanEntity ginwaQuanEntity);

    @Override
    Integer deleteById(Serializable serializable);

    Integer delete(GinwaQuanEntity ginwaQuanEntity);

    @Override
    Integer updateById(GinwaQuanEntity ginwaQuanEntity);

    Integer update(GinwaQuanEntity ginwaQuanEntity);

    @Override
    GinwaQuanEntity selectById(Serializable serializable);

    @Override
    GinwaQuanEntity selectOne(GinwaQuanEntity ginwaQuanEntity);

    List<GinwaQuanEntity> selectList();

    @Override
    List<Object> selectObjs(Wrapper<GinwaQuanEntity> wrapper);

    @Override
    List<GinwaQuanEntity> selectPage(RowBounds rowBounds, Wrapper<GinwaQuanEntity> wrapper);

    @Override
    List<Map<String, Object>> selectMapsPage(RowBounds rowBounds, Wrapper<GinwaQuanEntity> wrapper);

    @Override
    List<Map<String, Object>> selectMaps(Wrapper<GinwaQuanEntity> wrapper);
}

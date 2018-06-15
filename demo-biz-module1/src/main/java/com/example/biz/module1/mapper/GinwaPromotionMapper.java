package com.example.biz.module1.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.biz.module1.entity.GinwaPromotionEntity;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;

public interface GinwaPromotionMapper extends BaseMapper<GinwaPromotionEntity> {
    @Override
    Integer insert(GinwaPromotionEntity ginwaPromotionEntity);

    @Override
    Integer deleteById(Serializable serializable);

    Integer delete(GinwaPromotionEntity ginwaPromotionEntity);

    @Override
    Integer updateById(GinwaPromotionEntity ginwaPromotionEntity);

    Integer update(GinwaPromotionEntity ginwaPromotionEntity);

    @Override
    GinwaPromotionEntity selectById(Serializable serializable);

    @Override
    GinwaPromotionEntity selectOne(GinwaPromotionEntity ginwaPromotionEntity);

    List<GinwaPromotionEntity> selectList();

    @Override
    List<Object> selectObjs(Wrapper<GinwaPromotionEntity> wrapper);

    @Override
    List<GinwaPromotionEntity> selectPage(RowBounds rowBounds, Wrapper<GinwaPromotionEntity> wrapper);
}

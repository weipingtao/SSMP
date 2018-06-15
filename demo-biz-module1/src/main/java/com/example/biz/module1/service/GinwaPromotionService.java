package com.example.biz.module1.service;

import com.example.biz.module1.entity.GinwaPromotionEntity;

import java.util.List;

public interface GinwaPromotionService{

    Integer insert(GinwaPromotionEntity ginwaPromotionEntity);

    Integer delete(GinwaPromotionEntity ginwaPromotionEntity);

    Integer update(GinwaPromotionEntity ginwaPromotionEntity);

    List<GinwaPromotionEntity> selectList();
}

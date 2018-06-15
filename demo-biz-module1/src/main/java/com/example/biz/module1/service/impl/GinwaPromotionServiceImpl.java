package com.example.biz.module1.service.impl;

import com.example.biz.module1.entity.GinwaPromotionEntity;
import com.example.biz.module1.mapper.GinwaPromotionMapper;
import com.example.biz.module1.service.GinwaPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GinwaPromotionServiceImpl implements GinwaPromotionService {

    @Autowired
    private GinwaPromotionMapper ginwaPromotionMapper;

    @Override
    public Integer insert(GinwaPromotionEntity ginwaPromotionEntity) {
        return ginwaPromotionMapper.insert(ginwaPromotionEntity);
    }

    @Override
    public Integer delete(GinwaPromotionEntity ginwaPromotionEntity) {
        return ginwaPromotionMapper.delete(ginwaPromotionEntity);
    }

    @Override
    public Integer update(GinwaPromotionEntity ginwaPromotionEntity) {
        return ginwaPromotionMapper.update(ginwaPromotionEntity);
    }

    @Override
    public List<GinwaPromotionEntity> selectList() {
        return ginwaPromotionMapper.selectList();
    }
}

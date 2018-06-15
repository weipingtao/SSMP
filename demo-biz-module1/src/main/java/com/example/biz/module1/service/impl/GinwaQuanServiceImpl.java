package com.example.biz.module1.service.impl;

import com.example.biz.module1.entity.GinwaQuanEntity;
import com.example.biz.module1.mapper.GinwaQuanMapper;
import com.example.biz.module1.service.GinwaQuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GinwaQuanServiceImpl implements GinwaQuanService {

    @Autowired
    private GinwaQuanMapper ginwaQuanMapper;

    @Override
    public Integer insert(GinwaQuanEntity ginwaQuanEntity) {
        return ginwaQuanMapper.insert(ginwaQuanEntity);
    }

    @Override
    public Integer delete(GinwaQuanEntity ginwaQuanEntity) {
        return ginwaQuanMapper.delete(ginwaQuanEntity);
    }

    @Override
    public Integer update(GinwaQuanEntity ginwaQuanEntity) {
        return ginwaQuanMapper.update(ginwaQuanEntity);
    }

    @Override
    public List<GinwaQuanEntity> selectList() {
        return ginwaQuanMapper.selectList();
    }
}

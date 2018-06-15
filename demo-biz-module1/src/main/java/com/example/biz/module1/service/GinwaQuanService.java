package com.example.biz.module1.service;

import com.example.biz.module1.entity.GinwaQuanEntity;

import java.util.List;

public interface GinwaQuanService {

    Integer insert(GinwaQuanEntity ginwaQuanEntity);

    Integer delete(GinwaQuanEntity ginwaQuanEntity);

    Integer update(GinwaQuanEntity ginwaQuanEntity);

    List<GinwaQuanEntity> selectList();
}

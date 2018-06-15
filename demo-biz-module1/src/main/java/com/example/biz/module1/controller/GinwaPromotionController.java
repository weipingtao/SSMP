package com.example.biz.module1.controller;

import com.example.biz.module1.entity.GinwaPromotionEntity;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/promotion")
public class GinwaPromotionController {

    @PostMapping("/add")
    @ResponseBody
    @RequiresPermissions("userInfo:add")//权限管理;
    public Map add(@RequestBody GinwaPromotionEntity ginwaPromotionEntity){
        Map<String,String> map=new HashMap();
        return map;
    }
    @PostMapping("/delete")
    @ResponseBody
    @RequiresPermissions("userInfo:delete")//权限管理;
    public Map delete(@RequestBody GinwaPromotionEntity ginwaPromotionEntity){
        Map<String,String> map=new HashMap();
        return map;
    }
    @PostMapping("/update")
    @ResponseBody
    @RequiresPermissions("userInfo:update")//权限管理;
    public Map update(@RequestBody GinwaPromotionEntity ginwaPromotionEntity){
        Map<String,String> map=new HashMap();
        return map;
    }
    @PostMapping("/selectList")
    @ResponseBody
    @RequiresPermissions("userInfo:select")//权限管理;
    public Map selectList(@RequestBody GinwaPromotionEntity ginwaPromotionEntity){
        Map<String,String> map=new HashMap();
        return map;
    }
}

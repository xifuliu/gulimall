package com.rmd.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rmd.common.utils.PageUtils;
import com.rmd.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 13:54:26
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


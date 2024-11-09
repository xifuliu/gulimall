package com.rmd.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rmd.common.utils.PageUtils;
import com.rmd.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 09:36:27
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


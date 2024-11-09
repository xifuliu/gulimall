package com.rmd.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rmd.common.utils.PageUtils;
import com.rmd.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 13:19:05
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

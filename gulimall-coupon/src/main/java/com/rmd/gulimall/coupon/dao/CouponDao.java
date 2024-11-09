package com.rmd.gulimall.coupon.dao;

import com.rmd.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 13:19:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

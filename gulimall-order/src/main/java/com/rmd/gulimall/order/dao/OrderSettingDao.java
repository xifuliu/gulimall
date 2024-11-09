package com.rmd.gulimall.order.dao;

import com.rmd.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 13:49:49
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}

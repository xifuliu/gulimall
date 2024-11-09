package com.rmd.gulimall.product.dao;

import com.rmd.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 09:36:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

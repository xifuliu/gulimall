package com.rmd.gulimall.member.dao;

import com.rmd.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author david
 * @email xifu.liu@gmail.com
 * @date 2024-11-08 13:34:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

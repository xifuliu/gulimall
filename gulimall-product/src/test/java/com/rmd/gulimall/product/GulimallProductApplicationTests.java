package com.rmd.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rmd.gulimall.product.entity.BrandEntity;
import com.rmd.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
/*        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("Apple Iphone product");
        brandService.updateById(brandEntity);*/

        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandList.forEach((item)->{
            System.out.println(item);
        });

    }

}

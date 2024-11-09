package com.rmd.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* remote call other services
* 1. add dependency of open-feign
* 2. add an interface tell spring-cloud it will cal remote service
*    1). declare interface method that will call which service's request
* 3. enable remote call functionality @EnableFeignClients
*   @FeignClient("gulimall-coupon")
*   public interface CouponFeignService {
*      @RequestMapping("/coupon/coupon/member/list")
*      public R memberCoupons();
*   }
*
* */
@EnableFeignClients(basePackages = "com.rmd.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}

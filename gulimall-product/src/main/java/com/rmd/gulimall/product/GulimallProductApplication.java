package com.rmd.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/* How to integrate with mybatis plus
* 1) import dependensy
*        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.2.0</version>
        </dependency>
 2) configuration
    1) configure datasource
    . import mysql connector
    . in application.yml configure datasource information
    2) configure mybatis plus
    . add @MapperScan
    . tell mybatis plus where is the sql mapping file
        inside application.yml file add
        mybatis-plus:
 *        mapper-locations: classpath:/mapper*//**//*.xml
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}

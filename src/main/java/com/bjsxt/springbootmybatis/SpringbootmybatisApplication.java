package com.bjsxt.springbootmybatis;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjsxt.springbootmybatis.mapper")
public class SpringbootmybatisApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

}

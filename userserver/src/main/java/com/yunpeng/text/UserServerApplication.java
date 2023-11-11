package com.yunpeng.text;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.yunpeng.text.mapper")
public class UserServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserServerApplication.class,args);
        System.out.println( "Hello World!" );
    }
}

package com.miniits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: miniits
 * @Date:
 * @Time: <p>
 * Description:
 *  利用spring boot 搭建一个Java web 应用程序
 *      添加 @SpringBootApplication 注解
 *      在写一个main函数，ok
 */

@SpringBootApplication
public class MiniitsSpringBootWebApp {

    public static void main(String[] str){
        SpringApplication.run(MiniitsSpringBootWebApp.class,str);
    }
}

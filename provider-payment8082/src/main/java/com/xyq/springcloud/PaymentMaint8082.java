package com.xyq.springcloud;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xyq
 * @描述：
 * @创建时间：2021/1/6 21:46
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMaint8082 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMaint8082.class,args);
    }
}

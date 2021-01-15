package com.xyq.springcloud.controller;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import com.xyq.springcloud.service.OrderService;
import com.xyq.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.util.List;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/23 22:34
 */
@RestController
@Slf4j
public class OrderController {
    //public static final String PAYMENT_URL = "http://localhost:8081";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private PaymentFeignService paymentFeignService;


    @GetMapping("/conusmer/queryservice")
    public CommonResult query(@RequestParam String id) {
        CommonResult query = paymentFeignService.queryservice();
        return  query;
    }

}

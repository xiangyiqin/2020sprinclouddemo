package com.xyq.springcloud.controller;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import com.xyq.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
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
    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/conusmer/query")
    public CommonResult<User> query(Long id) {
       return  restTemplate.getForObject(PAYMENT_URL + "/payment/query" + "?id=" + id, CommonResult.class);
    }

    @GetMapping("/conusmer/payment")
    public CommonResult<User> queryPayment(Long id) {
        return  restTemplate.getForObject(PAYMENT_URL + "/payment/get/1", CommonResult.class);
    }

    @GetMapping("/conusmer/sendWorkMq")
    public CommonResult sendWorkMq() {
        return orderService.mqSend();
    }

    @GetMapping(value = "/consumer/payment/lb")
    public CommonResult getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        if (instances == null || instances.size() <= 0) {
            return null;
        }
        return new CommonResult(200,"shilie",instances);
    }
}

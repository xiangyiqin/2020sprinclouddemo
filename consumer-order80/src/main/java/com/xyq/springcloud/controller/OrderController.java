package com.xyq.springcloud.controller;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/23 22:34
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8081";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/conusmer/query")
    public CommonResult<User> query(Long id) {
       return  restTemplate.getForObject(PAYMENT_URL + "/payment/query" + "?id=" + id, CommonResult.class);
    }
}

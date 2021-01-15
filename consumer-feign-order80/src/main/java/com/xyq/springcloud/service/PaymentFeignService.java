package com.xyq.springcloud.service;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xyq
 * @描述：
 * @创建时间：2021/1/11 21:55
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "payment/queryservice")
    CommonResult queryservice();

}

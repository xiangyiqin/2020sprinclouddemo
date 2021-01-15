package com.xyq.springcloud.controller;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import com.xyq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/22 22:28
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private PaymentService paymentService;
    @PostMapping("payment/create")
    public CommonResult create(User user){
        int i = paymentService.create(user);
        log.info("插入结果"+i);
        if(i>0){
            return new CommonResult(200,"success",i);
        }else {
            return new CommonResult(404,"fail",null);
        }
    }
    @GetMapping("payment/query")
    public CommonResult query( ){
       Long id=1l;
        User query = paymentService.query(id);
        log.info("查询结果"+query);
        if(query!=null){
            return new CommonResult(200,"success",query);
        }else {
            return new CommonResult(404,"fail",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return new CommonResult(200, "查询成功,端口号: " + serverPort);
    }
    @GetMapping(value = "/payment/queryservice")
    public CommonResult queryservice() {
        return new CommonResult(200, "查询成功,端口号: " + serverPort);
    }
}

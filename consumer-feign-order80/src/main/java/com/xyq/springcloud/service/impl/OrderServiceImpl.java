package com.xyq.springcloud.service.impl;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import com.xyq.springcloud.service.OrderService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/29 19:56
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Override
    public CommonResult mqSend() {
        for(int i=0;i<100;i++){
           // amqpTemplate.convertAndSend("exchangefanout","","fanout模型");
            amqpTemplate.convertAndSend("work","发送了一条消息"+i);
        }
        return new CommonResult(200,"发送成功");
    }
}

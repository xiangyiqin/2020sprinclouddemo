package com.xyq.springcloud.service;

import com.xyq.springcloud.entities.CommonResult;
import com.xyq.springcloud.entities.User;
import org.springframework.stereotype.Service;


/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/29 19:54
 */
public interface OrderService {
    public CommonResult mqSend();
}

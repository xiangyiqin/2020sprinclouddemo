package com.xyq.springcloud.service;

import com.xyq.springcloud.entities.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/22 22:26
 */
public interface PaymentService {
    public int create( User user);
    public User query( long id);
}

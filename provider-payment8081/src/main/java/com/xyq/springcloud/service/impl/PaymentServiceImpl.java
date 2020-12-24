package com.xyq.springcloud.service.impl;

import com.xyq.springcloud.dao.PaymentDao;
import com.xyq.springcloud.entities.User;
import com.xyq.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/22 22:26
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(User user) {
        return paymentDao.create(user);
    }

    @Override
    public User query(long id) {
        return paymentDao.query(id);
    }
}

package com.xyq.springcloud.dao;

import com.xyq.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/22 22:12
 */
@Mapper
public interface PaymentDao {
    public int create(@Param("user") User user);
    public User query(@Param("id") long id);
}

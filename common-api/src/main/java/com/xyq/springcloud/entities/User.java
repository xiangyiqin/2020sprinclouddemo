package com.xyq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/24 22:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -8205651405199887766L;
    private Long id;
    private String name;
    private int age;
    private String address;
}
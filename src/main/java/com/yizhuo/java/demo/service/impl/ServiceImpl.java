package com.yizhuo.java.demo.service.impl;

import com.yizhuo.java.demo.service.IService;
import com.yizhuo.java.spring.annotation.Service;

/**
 * Created by yizhuo on 2018/5/12.
 */
@Service
public class ServiceImpl implements IService{
    @Override
    public void doSth() {
        System.out.println("ServiceImpl doSth..");
    }
}

package com.ithezebin.service.impl;

import com.ithezebin.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements TestService {
    public void sayHi() {
        System.out.println("执行了 Service的 sayHi 方法~~~");
    }
}
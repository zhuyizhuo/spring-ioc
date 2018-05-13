package com.yizhuo.java.demo.mvc.action;

import com.yizhuo.java.demo.service.IService;
import com.yizhuo.java.spring.annotation.Autowired;
import com.yizhuo.java.spring.annotation.Controller;

/**
 * Created by yizhuo on 2018/5/12.
 */
@Controller
public class TestController {
    @Autowired
    private IService service;

    public void doSth(){
        service.doSth();
    }

}

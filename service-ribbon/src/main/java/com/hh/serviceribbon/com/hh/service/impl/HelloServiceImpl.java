/**
 * Copyright (c) 2008-2015 浩瀚深度 All Rights Reserved.
 *
 * <p>FileName: HelloServiceImpl.java</p>
 *
 * @author jiangningning
 * @date 2018/10/23
 * @version 1.0
 * History:
 * v1.0.0, 姜宁宁 2018/10/23 Create
 */
package com.hh.serviceribbon.com.hh.service.impl;

import com.hh.serviceribbon.com.hh.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>Title: HelloServiceImpl</p>
 * <p>Description: </p>
 * @author jiangningning
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hello/" + name, String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}

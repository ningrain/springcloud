/**
 * Copyright (c) 2008-2015 浩瀚深度 All Rights Reserved.
 *
 * <p>FileName: HelloController.java</p>
 *
 * @author jiangningning
 * @date 2018/10/23
 * @version 1.0
 * History:
 * v1.0.0, 姜宁宁 2018/10/23 Create
 */
package com.hh.serviceribbon.com.hh.controller;

import com.hh.serviceribbon.com.hh.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Title: HelloController</p>
 * <p>Description: </p>
 * @author jiangningning
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hi/{name}")
    public String hello(@PathVariable String name){
        return helloService.hiService(name);
    }

}

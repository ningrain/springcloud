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
package com.hh.servicehi.com.hh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: HelloController</p>
 * <p>Description: </p>
 * @author jiangningning
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable String name){
        return "hi " + name + " ,i am from port:" + port;
    }

}

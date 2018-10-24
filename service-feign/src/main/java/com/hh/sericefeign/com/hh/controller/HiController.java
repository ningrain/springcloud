/**
 * Copyright (c) 2008-2015 浩瀚深度 All Rights Reserved.
 *
 * <p>FileName: HiController.java</p>
 *
 * @author jiangningning
 * @date 2018/10/23
 * @version 1.0
 * History:
 * v1.0.0, 姜宁宁 2018/10/23 Create
 */
package com.hh.sericefeign.com.hh.controller;

import com.hh.sericefeign.com.hh.service.HiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>Title: HiController</p>
 * <p>Description: </p>
 * @author jiangningning
 */
@RestController
public class HiController {

    @Resource
    private HiService hiService;

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable("name") String name){
        return hiService.hi(name);
    }

}

/**
 * Copyright (c) 2008-2015 浩瀚深度 All Rights Reserved.
 *
 * <p>FileName: HiService.java</p>
 *
 * @author jiangningning
 * @date 2018/10/23
 * @version 1.0
 * History:
 * v1.0.0, 姜宁宁 2018/10/23 Create
 */
package com.hh.sericefeign.com.hh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Title: HiService</p>
 * <p>Description: </p>
 * @author jiangningning
 */
@FeignClient("service-hi")
public interface HiService {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String hi(@PathVariable("name") String name);

}

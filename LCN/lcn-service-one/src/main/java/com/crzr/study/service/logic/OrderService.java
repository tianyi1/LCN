package com.crzr.study.service.logic;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( name = "lcn-service-tow")
public interface OrderService {
    /**
     * 保存数据
     */
    @RequestMapping(value = "/lcn-service-tow/saveOrder", method = RequestMethod.POST,consumes="application/json")
    void saveOrder(@RequestBody OrderVo request);
}

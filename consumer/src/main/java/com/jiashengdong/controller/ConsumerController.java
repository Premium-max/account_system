package com.jiashengdong.controller;

import com.jiashengdong.service.TestService;
import com.jiashengdong.service.TestService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    public TestService testService;
    @Autowired
    public TestService1 testService1;

    /**方式一：RestTemplate调用
     * @return
     */
    @RequestMapping("getName")
    public String getName(){
        return testService.getName();
    }

    /**
     * 方式二：@FeignClient调用
     * @return
     */
    @RequestMapping("getName1")
    public String getName1(){
        return testService1.getName1();
    }
}

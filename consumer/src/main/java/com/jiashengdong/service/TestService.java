package com.jiashengdong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate template;

    public String getName(){
        // 调用子模块接口地址
        String name= template.getForObject("http://service-provider/test/getName",String.class);
        return name;
    }
}

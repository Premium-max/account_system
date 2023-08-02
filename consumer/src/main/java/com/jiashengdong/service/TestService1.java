package com.jiashengdong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-provider")
public interface TestService1 {

    @GetMapping("test/getName")
    public String getName1();

}

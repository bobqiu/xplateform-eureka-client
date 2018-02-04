package com.qiu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * Created by: bobqiu
 * Date: 2018/2/4 下午11:11
 */
@RestController
public class TestService {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}

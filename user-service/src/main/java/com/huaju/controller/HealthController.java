package com.huaju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 服务健康检查
 */
@RestController
@RequestMapping("/health")
public class HealthController {
    
    /**
     * 健康检查接口
     * @return OK!
     */
    @GetMapping("/health")
    public String health() {
        return "OK!";
    }

}

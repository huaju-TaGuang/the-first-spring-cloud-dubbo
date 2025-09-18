package com.huaju.unwhereapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务健康控制器
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    /**
     * 验证服务健康
     * @return OK
     */
    @GetMapping("/ok")
    public String ok(){
        return "OK!";
    }

}

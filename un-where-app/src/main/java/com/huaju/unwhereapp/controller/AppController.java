package com.huaju.unwhereapp.controller;

import com.huaju.innerservice.InnerUserService;
import com.huaju.unwhereapp.service.AppService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 程序服务
 */
@RestController
@RequestMapping("/app")
public class AppController {

    @Resource
    private AppService appService;

    /**
     * 测试接口
     * @return
     */
    @GetMapping("/test")
    public long test(){
        return appService.test();
    }

}

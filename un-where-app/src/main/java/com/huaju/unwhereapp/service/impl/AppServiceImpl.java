package com.huaju.unwhereapp.service.impl;

import com.huaju.innerservice.InnerUserService;
import com.huaju.unwhereapp.service.AppService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import com.huaju.model.entity.App;
import com.huaju.unwhereapp.mapper.AppMapper;

@Service
@Slf4j
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements AppService {

    @DubboReference
    private InnerUserService userService;

    @Override
    public long test(){
        return userService.userRegister("", "", "");
    }

}

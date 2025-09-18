package com.huaju.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import com.huaju.innerservice.InnerUserService;

/**
 * 内部用户服务实现类
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {
    
    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword){
        return 10721;
    }

}

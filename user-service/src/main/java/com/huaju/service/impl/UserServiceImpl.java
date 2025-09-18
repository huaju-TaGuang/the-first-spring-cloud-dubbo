package com.huaju.service.impl;

import org.springframework.stereotype.Service;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.huaju.service.UserService;
import com.huaju.model.entity.User;
import com.huaju.mapper.UserMapper;

/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    
    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword){
        return 10722;
    }

}

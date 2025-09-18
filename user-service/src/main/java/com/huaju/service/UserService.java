package com.huaju.service;

import com.mybatisflex.core.service.IService;

import com.huaju.model.entity.User;

/**
 * 用户服务层
 */
public interface UserService extends IService<User> {
    
    /**
     * 用户注册
     * @param userAccount 账号
     * @param userPassword 密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

}

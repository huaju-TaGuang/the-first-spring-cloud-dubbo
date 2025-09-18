package com.huaju.unwhereapp.service;

import com.huaju.model.entity.App;
import com.mybatisflex.core.service.IService;

/**
 * 程序基本服务
 *
 * @author huaju
 */
public interface AppService extends IService<App> {

    /**
     * 测试方法
     * @return
     */
    public long test();

}

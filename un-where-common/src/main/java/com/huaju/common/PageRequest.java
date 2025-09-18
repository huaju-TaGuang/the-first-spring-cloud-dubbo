package com.huaju.common;

import lombok.Data;

/**
 * 分页请求封装
 */
@Data
public class PageRequest {
    /**
     * 当前页码
     */
    private Integer pageNum;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 是否升序
     */
    private Boolean asc;
}

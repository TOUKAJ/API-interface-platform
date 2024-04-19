package com.zhu.service;


import com.zhu.model.entity.User;

/**
 * 内部用户服务
 */
public interface InnerUserService {

    /**
     * （根据accessKey查询用户）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}

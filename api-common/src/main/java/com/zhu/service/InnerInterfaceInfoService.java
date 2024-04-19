package com.zhu.service;


import com.zhu.model.entity.InterfaceInfo;

/**
 * 内部接口信息服务
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询接口是否存在（请求路径、请求方法）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}

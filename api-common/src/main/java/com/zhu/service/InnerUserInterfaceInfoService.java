package com.zhu.service;

/**
 * 内部用户接口信息服务
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 总次数+1，剩余次数-1；
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);


    /**
     *判断剩余次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeleftNums(long interfaceInfoId, long userId);

}

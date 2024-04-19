package com.zhu.project.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhu.model.entity.InterfaceInfo;

/**
* @author 朱先生
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-02-28 16:18:12
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

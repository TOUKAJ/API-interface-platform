package com.zhu.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhu.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 朱先生
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-03-20 19:13:18
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int i);

}





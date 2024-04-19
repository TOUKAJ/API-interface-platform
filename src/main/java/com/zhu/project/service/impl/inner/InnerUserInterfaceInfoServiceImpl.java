package com.zhu.project.service.impl.inner;
import com.zhu.model.entity.UserInterfaceInfo;
import com.zhu.project.mapper.UserInterfaceInfoMapper;
import com.zhu.project.service.UserInterfaceInfoService;
import com.zhu.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;
import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 内部用户接口信息服务实现类
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;


    /**
     * 可用次数-1  总次数+1;
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }


    /**
     * 判断剩余次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public boolean invokeleftNums(long interfaceInfoId, long userId) {
        HashMap<String,Object> map = new HashMap<>();

        //自定义查询
        map.put("interfaceInfoId",interfaceInfoId);
        map.put("userId",userId);
        List<UserInterfaceInfo> userInterfaceInfos = userInterfaceInfoMapper.selectByMap(map);
        if(userInterfaceInfos.size()==0)
            return false;
        Integer leftNum = userInterfaceInfos.get(0).getLeftNum();
        if(leftNum>0)
            return true;
        else
            return false;
    }
}

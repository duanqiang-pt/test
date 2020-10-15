package com.zhongsheng.checker;

import java.util.List;

import com.zhongsheng.component.Limit;
import com.zhongsheng.exception.QueryParamIllgalException;

/**
 *  关于Limi条件的检查者
 * @version 1.0
 */
public class LimitConditionChecker <T>{
    
    /**
     * 校验方法
     * @param limitCondition    对于limit条件需要校验的入参
     */
    public static <T> void  checkLimitParams(List<T> willHandleData,Limit limitCondition){
        
        if(limitCondition==null){
            return;
        }
        
        int offset = limitCondition.getOffset();
        
        if(offset<0){
            throw new QueryParamIllgalException("offset is not less zero !");
        }
        
        int endIndex = offset+limitCondition.getSize();
        
        //防止数组下标越界
        if(offset>=willHandleData.size()||endIndex>=willHandleData.size()){
            throw new QueryParamIllgalException("offset or size is illgal !");
        }
        
    }

}

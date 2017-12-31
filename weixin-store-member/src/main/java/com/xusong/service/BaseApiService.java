package com.xusong.service;

import com.xusong.entity.HttpResultEntity;
import constants.Constants;
import org.springframework.stereotype.Component;

/**
 * Created by XuSong on 2017/12/30.
 */

/**
 * 封装返回页面的结果
 */
@Component
public class BaseApiService {
    // 封装成功
    public HttpResultEntity setResultSuccess() {
        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
    }

    public HttpResultEntity setResultData(Object data) {
        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
    }

    // 失败
    public HttpResultEntity setResultError(String msg) {
        return setResult(Constants.HTTP_RES_CODE_500, msg, null);
    }

    // 自定义
    public HttpResultEntity setResult(Integer code, String msg, Object data) {
        HttpResultEntity httpResultEntity = new HttpResultEntity();
        httpResultEntity.setCode(code);
        httpResultEntity.setMsg(msg);
        if (data != null)
            httpResultEntity.setData(data);
        return httpResultEntity;
    }
}

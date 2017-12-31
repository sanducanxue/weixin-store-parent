package com.xusong.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by XuSong on 2017/12/30.
 */
@Getter
@Setter
public class HttpResultEntity {
    Integer code;
    String msg;
    Object data;
}

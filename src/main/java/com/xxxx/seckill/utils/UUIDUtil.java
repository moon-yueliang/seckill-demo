package com.xxxx.seckill.utils;

import java.util.UUID;

/**
 * Created by jianghao on 2021/8/20.
 * <p>
 * 唯一id生成类
 */
public class UUIDUtil {

    public static String uuid() {

        return UUID.randomUUID().toString().replace("-", "");
    }

}

package com.ydy.mycloud.sys.utils;

import java.util.Random;

/**
 * @ClassName KeyUtil
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/9 18:09
 * @Version 1.0
 **/
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间 + 6位随机数
     * 在多线程的情况下  还是有可能会生成相同的主键 所以需要加 synchronized ,static synchronized方法也相当于全局锁，相当于锁住了代码段。
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        //系统生成毫秒
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}

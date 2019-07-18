package com.hao0129.cloud.common.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 文件常量
 * @author WANGHAO 2019-07-16
 */
@Component
public class FileConstant {

    @Autowired
    MineTypeConstant mineType;

    public enum FileMeta {
        NAME,SIZE,OWNER,SUFFIX,TIMESTAMP
    }
}

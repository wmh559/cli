package com.wmh.user.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wmh
 */
@Component
public class MyMetaHandler implements MetaObjectHandler {

    /**
     * 实现MetaObjectHandler接口
     * 在insertFill和updateFill配置就可以在入库和更新时添加对应的属性数据
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"createBy",String.class,"wmh");
        this.strictInsertFill(metaObject,"createTime", Date.class,new Date());
        this.strictInsertFill(metaObject,"deleteFlag", Integer.class,0);
        this.strictInsertFill(metaObject,"version", Integer.class,0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateBy",String.class,"wmh");
        this.strictUpdateFill(metaObject,"updateTime", Date.class,new Date());
    }
}

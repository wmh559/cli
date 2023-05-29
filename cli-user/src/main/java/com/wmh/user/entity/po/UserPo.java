package com.wmh.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import com.wmh.entity.BaseEntity;
import lombok.Data;


/**
 * @author wmh
 * po只和数据库交互
 */
@TableName("cli_user")
@Data
public class UserPo extends BaseEntity {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;
}

package com.yunpeng.text.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@TableName("t_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    @TableField("user_name")
    private String username;
    private int gender;
    @TableField("country_id")
    private int countryId;
    private Date birthday;
    private Date createTime;
}

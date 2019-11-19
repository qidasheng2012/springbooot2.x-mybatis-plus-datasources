package com.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("老师实体对象")
@Data
@TableName("t_teacher")
public class Teacher {

    @ApiModelProperty("老师id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("老师姓名")
    private String name;

    @ApiModelProperty("老师年龄")
    private Integer age;

    @ApiModelProperty("老师所教学科")
    private String subject;
}

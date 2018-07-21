package com.seawaterbt.ssm.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("老师vo")
public class TeacherVo {

    @ApiModelProperty("老师姓名")
    private String name;

    @ApiModelProperty("老师年龄")
    private Integer age;

    @ApiModelProperty("老师教的学科")
    private String subject;
}

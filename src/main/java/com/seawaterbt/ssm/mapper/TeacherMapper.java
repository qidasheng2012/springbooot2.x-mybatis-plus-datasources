package com.seawaterbt.ssm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.entity.Teacher;
import com.seawaterbt.ssm.enums.DataSourceEnum;

public interface TeacherMapper extends BaseMapper<Teacher> {

    @Override
    @DataSource(DataSourceEnum.DB2)
    Integer insert(Teacher teacher);
}

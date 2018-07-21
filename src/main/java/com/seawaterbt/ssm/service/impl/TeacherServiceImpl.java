package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.entity.Teacher;
import com.seawaterbt.ssm.enums.DataSourceEnum;
import com.seawaterbt.ssm.mapper.TeacherMapper;
import com.seawaterbt.ssm.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper,Teacher> implements TeacherService {

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean insert(Teacher entity) {
        return super.insert(entity);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<Teacher> selectList(Wrapper<Teacher> wrapper) {
        return super.selectList(wrapper);
    }


}

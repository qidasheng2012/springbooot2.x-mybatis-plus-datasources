package com.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.annotation.DataSource;
import com.ssm.entity.Teacher;
import com.ssm.enums.DataSourceEnum;
import com.ssm.mapper.TeacherMapper;
import com.ssm.service.TeacherService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean save(Teacher entity) {
        return super.save(entity);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean updateById(Teacher entity) {
        return super.updateById(entity);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<Teacher> list(Wrapper<Teacher> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public IPage<Teacher> page(IPage<Teacher> page, Wrapper<Teacher> queryWrapper) {
        return super.page(page, queryWrapper);
    }
}

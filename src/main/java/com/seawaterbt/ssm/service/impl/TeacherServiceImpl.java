package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.entity.Teacher;
import com.seawaterbt.ssm.enums.DataSourceEnum;
import com.seawaterbt.ssm.mapper.TeacherMapper;
import com.seawaterbt.ssm.service.TeacherService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper,Teacher> implements TeacherService {

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean insert(Teacher entity) {
        return super.insert(entity);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean deleteById(Serializable id) {
        return super.deleteById(id);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean updateById(Teacher entity) {
        return super.updateById(entity);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public Teacher selectById(Serializable id) {
        return super.selectById(id);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<Teacher> selectList(Wrapper<Teacher> wrapper) {
        return super.selectList(wrapper);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public Page<Teacher> selectPage(Page<Teacher> page) {
        return super.selectPage(page);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public Page<Teacher> selectPage(Page<Teacher> page, Wrapper<Teacher> wrapper) {
        return super.selectPage(page, wrapper);
    }
}

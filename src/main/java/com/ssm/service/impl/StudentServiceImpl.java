package com.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.entity.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}

package com.seawaterbt.ssm.controller;

import com.seawaterbt.ssm.entity.Student;
import com.seawaterbt.ssm.entity.Teacher;
import com.seawaterbt.ssm.service.StudentService;
import com.seawaterbt.ssm.service.TeacherService;
import com.seawaterbt.ssm.service.impl.StudentServiceImpl;
import com.seawaterbt.ssm.service.impl.TeacherServiceImpl;
import com.seawaterbt.ssm.vo.StudentVo;
import com.seawaterbt.ssm.vo.TeacherVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("测试多数据源")
@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("添加学生")
    @PostMapping("/add/student")
    public String addStudent(@RequestBody StudentVo student){
        Student stu = new Student();
        stu.setName(student.getName());
        stu.setAge(student.getAge());
        stu.setClassname(student.getClassname());
        return studentService.insert(stu)?"添加成功":"添加失败";
    }

    @ApiOperation(value = "添加老师")
    @PostMapping("/add/teacher")
    public String addTea(@RequestBody TeacherVo teacher){
        Teacher tea = new Teacher();
        tea.setName(teacher.getName());
        tea.setAge(teacher.getAge());
        tea.setSubject(teacher.getSubject());
        return teacherService.insert(tea)?"添加成功":"添加失败";
    }
}

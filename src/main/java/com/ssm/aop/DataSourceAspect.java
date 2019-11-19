package com.ssm.aop;

import com.ssm.annotation.DataSource;
import com.ssm.multiple.DataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
@Order(-1)
public class DataSourceAspect {

    @Pointcut("@within(com.ssm.annotation.DataSource) || @annotation(com.ssm.annotation.DataSource)")
    public void pointCut() {

    }

    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource) {
        String ds = dataSource.value().getValue();
        log.info("选择数据源---[{}]", ds);
        DataSourceContextHolder.setDataSource(ds);
    }

    @After("pointCut()")
    public void doAfter() {
        DataSourceContextHolder.clear();
    }
}

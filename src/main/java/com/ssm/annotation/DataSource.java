package com.ssm.annotation;

import com.ssm.enums.DataSourceEnum;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    DataSourceEnum value() default DataSourceEnum.DB1;
}

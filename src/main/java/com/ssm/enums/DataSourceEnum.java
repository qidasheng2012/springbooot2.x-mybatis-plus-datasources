package com.ssm.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum DataSourceEnum {

    DB1("db1"),
    DB2("db2");

    private String value;

}

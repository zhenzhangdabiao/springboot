package com.example.enums;

/**
 * Created by ZhuBin on 2019/7/29.
 */
public interface MyEnum {
    String getValue();

    String getCode();

    MyEnum getByCode(String code);
}

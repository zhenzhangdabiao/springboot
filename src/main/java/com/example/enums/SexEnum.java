/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SexEnum
 * Author:   ZhuBin
 * Date:     2019/7/29 17:04
 * Description:
 * History:
 * <author>      <time>               <version>          <desc>
 * SexEnum       2019/7/29 17:04          1.0.0
 */
package com.example.enums;

import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZhuBin
 * @create 2019/7/29
 * @since 1.0.0
 */
public enum  SexEnum implements MyEnum{
    MAN("man","1"),
    WOMAN("women","2")
    ;
    private String value;
    private String code;
    SexEnum(String value,String code){}

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public MyEnum getByCode(String code) {
        return Stream.of(values())
                .filter(item -> item.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
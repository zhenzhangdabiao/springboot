/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Person
 * Author:   ZhuBin
 * Date:     2019/7/29 17:27
 * Description:
 * History:
 * <author>      <time>               <version>          <desc>
 * Person       2019/7/29 17:27          1.0.0
 */
package com.example.entity;

import com.example.enums.SexEnum;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZhuBin
 * @create 2019/7/29
 * @since 1.0.0
 */
@Data
public class Person {
    private SexEnum sex;
    private String name;
    private String age;
}
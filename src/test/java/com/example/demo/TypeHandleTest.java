/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TypeHandleTest
 * Author:   ZhuBin
 * Date:     2019/7/29 17:26
 * Description:
 * History:
 * <author>      <time>               <version>          <desc>
 * TypeHandleTest       2019/7/29 17:26          1.0.0
 */
package com.example.demo;

import com.example.entity.Person;
import com.example.enums.SexEnum;
import com.example.mapper.PersonMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZhuBin
 * @create 2019/7/29
 * @since 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TypeHandleTest {

    @Autowired
    PersonMapper personMapper;

    public void insertTest(){
        Person person = new Person();
        person.setAge("18");
        person.setName("张三");
        person.setSex(SexEnum.MAN);
        personMapper.insert(person);
    }
}
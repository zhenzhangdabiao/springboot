/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyTypeHandle
 * Author:   ZhuBin
 * Date:     2019/7/29 16:57
 * Description:
 * History:
 * <author>      <time>               <version>          <desc>
 * MyTypeHandle       2019/7/29 16:57          1.0.0
 */
package com.example.handle;

import com.example.enums.MyEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ZhuBin
 * @create 2019/7/29
 * @since 1.0.0
 */
@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyTypeHandle implements TypeHandler<MyEnum> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, MyEnum myEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,myEnum.getCode());
    }

    @Override
    public MyEnum getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public MyEnum getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public MyEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
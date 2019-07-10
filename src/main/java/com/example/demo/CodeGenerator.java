/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CodeGenerator
 * Author:   ZhuBin
 * Date:     2019/7/10 16:15
 * Description:
 * History:
 * <author>      <time>               <version>          <desc>
 * CodeGenerator       2019/7/10 16:15          1.0.0
 */
package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ZhuBin
 * @create 2019/7/10
 * @since 1.0.0
 */
public class CodeGenerator {
    public static void main(String[] args) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/ssm?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("root")
                .setDriverName("com.mysql.cj.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                //这里结合了Lombok，所以设置为true，如果没有集成Lombok，可以设置为false
                .setEntityLombokModel(true)
                .setNaming(NamingStrategy.underline_to_camel);
        //这里因为我是多模块项目，所以需要加上子模块的名称，以便直接生成到该目录下，如果是单模块项目，可以将后面的去掉
        String projectPath = System.getProperty("user.dir");
        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };

        //设置作者，输出路径，是否重写等属性
        config.setActiveRecord(false)
                .setEnableCache(false)
                .setAuthor("zhuBin")
                .setOutputDir(projectPath + "/src/main/java")
                .setFileOverride(true)
                .setServiceName("%sService");
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplateEngine(new FreemarkerTemplateEngine())
                .setCfg(cfg)
                //这里进行包名的设置
                .setPackageInfo(
                        new PackageConfig()
                                .setParent("com.example")
                                .setController("controller")
                                .setEntity("entity")
                                .setMapper("mapper")
                                .setServiceImpl("service.impl")
                                .setService("service")
                ).execute();
    }
}
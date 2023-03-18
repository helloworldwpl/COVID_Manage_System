package com.wpl.springboot.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;


import java.util.Collections;

/**
 * @date 2022/4/3
 * @author wpl
 * mp 代码生成器
 * ps: 避免生成错误，先备份代码
 */

public class CodeGenerator {

    public static void main(String[] args) {
        generate();
    }

    private static void generate() {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/graduation?serverTimezone=Asia/Shanghai&useSSL=false",
                "root", "123456")
                .globalConfig(builder -> {
                    builder.author("wpl") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\folder\\graduation\\springboot\\src\\main\\java\\"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.wpl.springboot") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\folder\\毕业设计\\backend\\src\\main\\resources\\mapper\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();
                    builder.controllerBuilder().enableRestStyle()//开启生成@RestController控制器
                            .enableHyphenStyle();//开启驼峰转连字符
                    builder.addInclude("sys_knowledge") // 设置需要生成的表名
                            .addTablePrefix("t_","sys_"); // 设置过滤表前缀
                })
   //             .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}

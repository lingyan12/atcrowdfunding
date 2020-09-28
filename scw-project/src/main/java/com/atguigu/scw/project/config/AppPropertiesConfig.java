package com.atguigu.scw.project.config;


import com.atguigu.scw.project.bean.testBean.TestClass;
import com.atguigu.scw.project.component.OssTemplate;
import lombok.ToString;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppPropertiesConfig {

    public AppPropertiesConfig(){
        System.err.println("AppPropertiesConfig开始调用无参构造开始初始化");
    }

    @Bean
    @ConfigurationProperties(prefix = "oss")
    public OssTemplate ossTemplate(){

        OssTemplate oss = new OssTemplate();
        System.err.println(oss.show());


        return oss;

    }

    @Bean
    @ConfigurationProperties(prefix = "testclass")
    public TestClass TestClass(){

        System.err.println("TestClass-------------------------------------------------------------------");

        TestClass t = new TestClass();
//        t.setId(1);
//        t.setName("我是TestClass");

        return t;

    }







}

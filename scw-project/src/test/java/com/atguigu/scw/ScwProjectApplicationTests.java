package com.atguigu.scw;

import com.atguigu.scw.project.bean.testBean.TestClass;
import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@SpringBootTest
class ScwProjectApplicationTests {
//	@Autowired
//	TestClass t;

	@Test
	void contextLoads() {
//
//		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(ScwProjectApplicationTests.class);
////		ConfigurableApplicationContext run =(ConfigurableApplicationContext) new SpringApplication(ScwProjectApplicationTests.class);
//
//
//		TestClass t = (TestClass)run.getBean("TestClass");
//
//
//		System.err.println("测试 是否能自动获得TestClass：" + t);



	}

}

package com.atguigu.scw;

import com.atguigu.scw.project.bean.testBean.TestClass;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("com.atguigu.scw.project.mapper")
@SpringBootApplication
public class ScwProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ScwProjectApplication.class, args);

		TestClass t = (TestClass)run.getBean("TestClass");


//		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(ScwProjectApplication.class);
//		ConfigurableApplicationContext run =(ConfigurableApplicationContext) new SpringApplication(ScwProjectApplicationTests.class);


//		TestClass t = (TestClass)run.getBean("TestClass");


		System.err.println("测试 是否能自动获得TestClass：" + t);







	}






}

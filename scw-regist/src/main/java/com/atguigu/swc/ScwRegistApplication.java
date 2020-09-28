package com.atguigu.swc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ScwRegistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScwRegistApplication.class, args);
	}

}

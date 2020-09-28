package com.atguigu.scw;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class ScwUserApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	StringRedisTemplate redisTemplate;





	@Test
	void contextLoads() throws SQLException {

		Connection connection = dataSource.getConnection();
		System.out.println(connection);



	}

	    @Test
		public void Test(){

		redisTemplate.opsForValue().set("test" , "tset11111");


		}

		    @Test
		        public void Test3(){

				System.out.println(redisTemplate.opsForValue().get("test"));

			}

}

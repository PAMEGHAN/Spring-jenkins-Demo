package com.javatechie.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true,true);
	}

}

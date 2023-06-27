package com.kanyarashi.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
@Testcontainers
class ProductServiceApplicationTests {

//	static MongoDBContainer mongoDBContainer = new MongoDBContainer(dockerImageName())

	@Test
	void contextLoads() {
	}

}

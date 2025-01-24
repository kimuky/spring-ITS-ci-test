// package org.sparta.its.domain.hall.service;
//
// import static org.junit.jupiter.api.Assertions.*;
//
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.DynamicPropertyRegistry;
// import org.springframework.test.context.DynamicPropertySource;
// import org.testcontainers.containers.MySQLContainer;
// import org.testcontainers.junit.jupiter.Container;
// import org.testcontainers.junit.jupiter.Testcontainers;
//
// @SpringBootTest
// @Testcontainers
// class HallServiceTest {
// 	private static final String USERNAME = "root";
// 	private static final String PASSWORD = "12345";
// 	private static final String DATABASE_NAME = "its";
//
// 	@Container
// 	static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:8.0")
// 		.withUsername(USERNAME)
// 		.withPassword(PASSWORD)
// 		.withDatabaseName(DATABASE_NAME);
//
//
// 	@DynamicPropertySource
// 	public static void overrideProps(DynamicPropertyRegistry dynamicPropertyRegistry) {
// 		dynamicPropertyRegistry.add("spring.datasource.url", () -> mySQLContainer.getJdbcUrl());
// 		dynamicPropertyRegistry.add("spring.datasource.username", () -> USERNAME);
// 		dynamicPropertyRegistry.add("spring.datasource.password", () -> PASSWORD);
// 		dynamicPropertyRegistry.add("spring.jpa.hibernate.ddl-auto", () -> "update");
// 	}
//
// 	@DisplayName("테스트1")
// 	@Test
// 	void 테스트1() {
// 		System.out.println(mySQLContainer.getJdbcUrl());
// 	}
// }

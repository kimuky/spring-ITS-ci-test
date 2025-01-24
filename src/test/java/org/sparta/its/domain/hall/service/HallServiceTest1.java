package org.sparta.its.domain.hall.service;

import org.hibernate.annotations.processing.SQL;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.its.domain.user.Service.UserService;
import org.sparta.its.domain.user.dto.AuthRequest;
import org.sparta.its.domain.user.entity.User;
import org.sparta.its.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
@Sql("/db/dumd.sql")
class HallServiceTest1 {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	// @DisplayName("테스트1")
	// @Test
	// void 테스트1() {
	// 	userService.signUp(new AuthRequest.SignUpDto("test@test.com", "asd!@#D23", "kim", "010-1111-2222", "USER"));
	// }

	@DisplayName("테스트2")
	@Test
	void 테스트2() {
		User byIdOrThrow = userRepository.findByIdOrThrow(2L);

		System.out.println(byIdOrThrow.getEmail());
	}
}

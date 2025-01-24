// package org.sparta.its.domain.hall.service;
//
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.sparta.its.domain.user.Service.UserService;
// import org.sparta.its.domain.user.dto.AuthRequest;
// import org.sparta.its.domain.user.entity.User;
// import org.sparta.its.domain.user.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.testcontainers.junit.jupiter.Testcontainers;
//
// @SpringBootTest
// @Testcontainers
// class HallServiceTest2 {
//
// 	@Autowired
// 	private UserService userService;
//
// 	@Autowired
// 	private UserRepository userRepository;
//
// 	@DisplayName("테스트2")
// 	@Test
// 	void 테스트2() {
// 		User byIdOrThrow = userRepository.findByIdOrThrow(1L);
//
// 		System.out.println(byIdOrThrow.getEmail());
// 	}
// }

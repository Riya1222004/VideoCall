package com.helloWorld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.helloWorld.user.User;
import com.helloWorld.user.UserService;

@SpringBootApplication
public class VideoCallAppFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallAppFinalApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Riya")
							.email("riya@mail.com")
							.password("aaa")
					.build());

			service.register(User.builder()
					.username("Diya")
					.email("diya@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Jiya")
					.email("jiya@mail.com")
					.password("aaa")
					.build());
		};
	}

}

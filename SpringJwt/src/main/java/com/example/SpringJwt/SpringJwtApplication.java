package com.example.SpringJwt;

import com.example.SpringJwt.entity.User;
import com.example.SpringJwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringJwtApplication {
	@Autowired
	private UserRepository userRepository;

	/*
	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User("Arturo", "password", "arturo1@hotmail.com"),
				new User("Karla", "pass1", "karla1@hotmail.com"),
				new User("Fernanda", "pass2", "fernanda1@hotmail.com"),
				new User("Alejandra", "pass3", "alejandra1@hotmail.com")

				).collect(Collectors.toList());
		userRepository.saveAll(users);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}

}

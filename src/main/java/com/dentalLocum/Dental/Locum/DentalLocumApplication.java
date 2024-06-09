package com.dentalLocum.Dental.Locum;

import com.dentalLocum.Dental.Locum.model.User;
import com.dentalLocum.Dental.Locum.repo.UserRepository;
import com.dentalLocum.Dental.Locum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DentalLocumApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DentalLocumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting Dental Locum Application");
		User user = new User();


		user.setName("Dental Locum");
		user.setPassword("DentalLocum123!"); // Use a stronger password in production
		user.setEmail("dentallocum@gmail.com");
		user.setRole(User.Role.LOCUM);
		user.setCredentials("Dental Locum Credentials: GDC Number 123456");
		user.setSpecialization("General Dentistry");
		user.setRegistrationNumber("GDC-123456");

		User user1 = userService.createUser(user);

		System.out.println(user1.getId());


	}
}

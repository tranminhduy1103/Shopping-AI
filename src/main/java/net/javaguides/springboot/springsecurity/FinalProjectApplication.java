package net.javaguides.springboot.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class FinalProjectApplication {
//test
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}
}

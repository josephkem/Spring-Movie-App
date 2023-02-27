package dev.kemi.moviessprg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MoviesSprgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesSprgApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Hello World!";
	}

}

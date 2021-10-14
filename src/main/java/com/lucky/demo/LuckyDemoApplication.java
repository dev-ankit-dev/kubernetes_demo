package com.lucky.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LuckyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckyDemoApplication.class, args);
	}

	@GetMapping("/hello")

	public String hello() {

		return "hello frist example of kubernates in git hub demfdefdefe" ;
	}

}

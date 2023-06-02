package com.example.InsurenceProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
@RestController
@RequestMapping("/insurence")
public class InsurenceProviderApplication {
	@GetMapping("/getall")
	public List<String>getPlans(){
		return Stream.of("premium","gold","silver").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(InsurenceProviderApplication.class, args);
	}

}

package com.dsa_practise.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CollectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionsApplication.class, args);
	}
}

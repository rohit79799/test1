package com.test1.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {
	int x = 100;
	int y = 200;
	float m = 10.3f;
	boolean istrue = true;

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}

package com.test1.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {
	int x = 100;
	int y = 200;
	boolean isIstrue2 = false;
	float m = 10.3f;
	boolean istrue = true;
	char ch = 'r';
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}

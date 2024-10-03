package com.vaibhav.jain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaibhav.jain.util.Sample;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
		System.out.println("Vaibhav Jain");
		
		Sample sample = new Sample();
		sample.m1();
	}

}

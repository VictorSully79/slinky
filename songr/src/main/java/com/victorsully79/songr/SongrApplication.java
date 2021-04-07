package com.victorsully79.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring does all work behind the scenes based on "ANNOTATIONS"
//This app runs because of the "ANNOTATION" @SpringBootApplication
@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

}

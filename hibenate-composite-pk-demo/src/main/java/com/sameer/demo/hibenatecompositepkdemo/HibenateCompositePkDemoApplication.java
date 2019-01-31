package com.sameer.demo.hibenatecompositepkdemo;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibenateCompositePkDemoApplication implements CommandLineRunner {
	
	@Autowired
	BookRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(HibenateCompositePkDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.saveAll(Arrays.asList(new Book("Hello Koding 1", new Date()), new Book("Hello Koding 2", new Date())));
        // Fetch all
        System.out.println("My books: " + repository.findAll());
	}

}


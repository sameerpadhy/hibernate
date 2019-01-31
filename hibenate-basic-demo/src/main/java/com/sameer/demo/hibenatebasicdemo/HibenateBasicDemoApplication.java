package com.sameer.demo.hibenatebasicdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibenateBasicDemoApplication implements CommandLineRunner{
	@Autowired
	 LibraryRepository libraryRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibenateBasicDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 libraryRepository.save(new Library("Library 1", new Address("Street 1", "Zip 1")));
	     libraryRepository.save(new Library("Library 2", new Address("Street 2", "Zip 2")));
	     
	    System.out.println(libraryRepository.count());
	     
	}

}


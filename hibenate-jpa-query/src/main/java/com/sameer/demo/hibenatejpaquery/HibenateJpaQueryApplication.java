package com.sameer.demo.hibenatejpaquery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibenateJpaQueryApplication implements CommandLineRunner{
	
	@Autowired
	CityRepository repository;
	
	@Autowired
	CityNamedQueryRepository namedQueryRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibenateJpaQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new City("Bratislava",432000));
		repository.save(new City("Budapest",432000));
		repository.save(new City("Prague", 1280000));
		repository.save(new City("Warsaw", 1748000));
		
		String name="Bratislava";
		List<City> cities = (List<City>) repository.findByNameEndsWith(name);
		System.out.println(cities.get(0));
		
		List<City> namedQueryCities =(List<City>) namedQueryRepository.findAllOrderedByNameDescending();
		System.out.println(namedQueryCities.get(1));
		
		
       
	}

}


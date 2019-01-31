package com.sameer.demo.hibenatejpaquery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CityNamedQueryRepository extends CrudRepository<City, Long> {

    List<City> findAllOrderedByNameDescending();
}

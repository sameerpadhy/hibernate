package com.sameer.demo.hibenatejpaquery;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {

    @Query("select c from City c where c.name like %?1")
    List<City> findByNameEndsWith(String chars);
}

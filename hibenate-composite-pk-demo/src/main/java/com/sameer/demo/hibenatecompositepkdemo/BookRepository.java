package com.sameer.demo.hibenatecompositepkdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{

}

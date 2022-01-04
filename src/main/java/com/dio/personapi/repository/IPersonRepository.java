package com.dio.personapi.repository;

import com.dio.personapi.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long> {
    
}

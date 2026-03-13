package com.example.SpringBatch.Repository;

import com.example.SpringBatch.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

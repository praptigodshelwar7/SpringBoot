package com.praptigodshelwar.learningrestapis.repository;

import com.praptigodshelwar.learningrestapis.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
}

package com.cjc.main.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.crud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

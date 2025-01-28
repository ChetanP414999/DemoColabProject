package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Calculator;

public interface CalculatorRepository extends JpaRepository<Calculator, Integer>{

}

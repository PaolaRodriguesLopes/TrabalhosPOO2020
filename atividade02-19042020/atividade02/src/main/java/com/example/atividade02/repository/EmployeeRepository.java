package com.example.atividade02.repository;

import com.example.atividade02.entidade.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

}
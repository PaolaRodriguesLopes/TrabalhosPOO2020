package com.example.atividade02.service;

import com.example.atividade02.entidade.Employee;
import com.example.atividade02.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployee (){

        return repository.findAll();

    }

}
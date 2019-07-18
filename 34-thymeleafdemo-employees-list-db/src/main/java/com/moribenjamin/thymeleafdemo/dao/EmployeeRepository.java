package com.moribenjamin.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moribenjamin.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

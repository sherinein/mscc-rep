package com.eshop.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

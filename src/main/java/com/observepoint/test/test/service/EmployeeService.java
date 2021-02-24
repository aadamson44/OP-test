package com.observepoint.test.test.service;

import com.observepoint.test.test.entity.Employee;
import com.observepoint.test.test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createOrUpdateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Long employeeId) {
        Optional<Employee> possibleEmployee = employeeRepository.findById(employeeId);

        return possibleEmployee.orElseGet(Employee::new);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}

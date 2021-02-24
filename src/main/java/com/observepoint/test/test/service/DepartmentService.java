package com.observepoint.test.test.service;

import com.observepoint.test.test.entity.Department;
import com.observepoint.test.test.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createOrUpdateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        Iterable<Department> departments = departmentRepository.findAll();
        Optional<Department> possibleDepartment = departmentRepository.findById(departmentId);

        return possibleDepartment.orElseGet(Department::new);
    }

    public void deleteDepartment(Department department) {
        departmentRepository.delete(department);
    }

}

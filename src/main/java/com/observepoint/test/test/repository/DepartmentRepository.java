package com.observepoint.test.test.repository;

import org.springframework.data.repository.CrudRepository;
import com.observepoint.test.test.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}

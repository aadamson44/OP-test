package com.observepoint.test.test.controller;

import com.observepoint.test.test.entity.Department;
import com.observepoint.test.test.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.createOrUpdateDepartment(department), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.createOrUpdateDepartment(department), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable("id") Long id) {
        return new ResponseEntity<>(departmentService.getDepartment(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable("id") long id) {
        Department department = departmentService.getDepartment(id);

        if(department.getId() != null) {
            departmentService.deleteDepartment(department);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

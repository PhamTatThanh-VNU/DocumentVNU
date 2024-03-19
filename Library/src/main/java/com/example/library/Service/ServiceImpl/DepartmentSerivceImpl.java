package com.example.library.Service.ServiceImpl;

import com.example.library.Model.Department;
import com.example.library.Repository.DepartmentRepository;
import com.example.library.Service.DepartmentService;

import java.util.List;
import java.util.Optional;

public class DepartmentSerivceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(Long id) {
        Optional<Department> department = Optional.ofNullable(departmentRepository.getReferenceById(id));
        if(department.isPresent()){
            return department;
        }
        return Optional.empty();
    }
}

package com.example.library.Service.ServiceImpl;

import com.example.library.Model.Department;
import com.example.library.Repository.DepartmentRepository;
import com.example.library.Service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class DepartmentSerivceImpl implements DepartmentService {
    @Autowired
    private final DepartmentRepository departmentRepository;

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

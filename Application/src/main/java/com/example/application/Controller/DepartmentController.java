package com.example.application.Controller;

import com.example.library.Model.Department;
import com.example.library.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/allDepartment")
    public List<Department> TestFunc(){
        return departmentService.findAll();
    }

    @GetMapping("/department")
    public Optional<Department> getDepartment(@RequestParam Long id) {
        return departmentService.findById(id);
    }
}

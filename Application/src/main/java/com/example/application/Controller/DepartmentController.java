package com.example.application.Controller;

import com.example.library.Model.Department;
import com.example.library.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/test")
    public List<Department> TestFunc(){
        return departmentService.findAll();
    }
}

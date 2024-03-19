package com.example.application.Controller;

import com.example.library.Model.Department;
import com.example.library.Service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;
    @GetMapping("/test")
    public Optional<Department> Hello(@RequestParam Long id){
        Optional<Department> department = departmentService.findById(id);
        return department;
    }
}

package com.example.library.Repository;

import com.example.library.DTO.SubjectDTO;
import com.example.library.Model.Department;
import com.example.library.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

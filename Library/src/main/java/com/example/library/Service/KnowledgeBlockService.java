package com.example.library.Service;

import com.example.library.Model.Department;
import com.example.library.Model.KnowledgeBlock;

import java.util.List;
import java.util.Optional;

public interface KnowledgeBlockService {
    List<KnowledgeBlock> findAll();
    Optional<KnowledgeBlock> findById(Long id);

    Optional<KnowledgeBlock> findByDepartment(String department);
}

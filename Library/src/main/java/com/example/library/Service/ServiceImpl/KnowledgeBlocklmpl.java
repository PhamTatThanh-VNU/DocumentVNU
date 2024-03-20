package com.example.library.Service.ServiceImpl;

import com.example.library.Model.Department;
import com.example.library.Model.KnowledgeBlock;
import com.example.library.Repository.KnowledgeBlockRepository;
import com.example.library.Service.KnowledgeBlockService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KnowledgeBlocklmpl implements KnowledgeBlockService {
    @Autowired
    private final KnowledgeBlockRepository knowledgeBlockRepository;

    @Override
    public List<KnowledgeBlock> findAll() {
        return knowledgeBlockRepository.findAll();
    }
    @Override
    public Optional<KnowledgeBlock> findById(Long id) {
        return knowledgeBlockRepository.findById(id);
    }

    @Override
    public Optional<KnowledgeBlock> findByDepartment(String department) {
        List<KnowledgeBlock> knowledgeBlockList = findAll();
        Optional<KnowledgeBlock> optional = Optional.empty();
        for (KnowledgeBlock knowledgeBlock: knowledgeBlockList) {
            if (department.equals(knowledgeBlock.getDepartment().getDepartmentName())) {
                optional = Optional.of(knowledgeBlock);
                break;
            }
        }
        return optional;
    }
}

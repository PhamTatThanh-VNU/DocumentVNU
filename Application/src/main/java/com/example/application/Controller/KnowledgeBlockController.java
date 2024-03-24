package com.example.application.Controller;

import com.example.library.DTO.KnowledgeBlockDTO;
import com.example.library.Model.Department;
import com.example.library.Model.KnowledgeBlock;
import com.example.library.Service.KnowledgeBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class KnowledgeBlockController {
    @Autowired
    private KnowledgeBlockService knowledgeBlockService;

    @GetMapping("/allKnowledgeBlock")
    public List<KnowledgeBlock> TestFunc(){
        return knowledgeBlockService.findAll();
    }

    @GetMapping("/knowledgeBlock")
    public Optional<KnowledgeBlock> getKnowledgeBlock(@RequestParam Long id) {
        return knowledgeBlockService.findById(id);
    }

    @GetMapping("/findByDepartment")
    public List<KnowledgeBlockDTO> getKnowledgeBlockByDepartment(@RequestParam("idDepartment") Long id) {
        return knowledgeBlockService.findByDepartment(id);
    }
}

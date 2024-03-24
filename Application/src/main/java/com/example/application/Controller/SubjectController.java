package com.example.application.Controller;

import com.example.library.DTO.SubjectDTO;
import com.example.library.Model.Subject;
import com.example.library.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping("/allSubject")
    @ResponseBody
    private List<Subject> allSubject(){
        return subjectService.findAllSubject();
    }
    @GetMapping("/filterSubject")
    public List<SubjectDTO> getKnowledgeBlockByDepartment(@RequestParam("knowledgeId") Long id) {
        return subjectService.filterSubject(id);
    }
}

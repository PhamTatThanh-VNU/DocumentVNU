package com.example.library.Service;


import com.example.library.DTO.SubjectDTO;
import com.example.library.Model.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAllSubject();
    List<SubjectDTO> filterSubject(Long id);
}

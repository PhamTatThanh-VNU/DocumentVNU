package com.example.library.Service.ServiceImpl;

import com.example.library.DTO.SubjectDTO;
import com.example.library.Model.Subject;
import com.example.library.Repository.SubjectRepository;
import com.example.library.Service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private final SubjectRepository subjectRepository;
    @Override
    public List<Subject> findAllSubject(){
        return subjectRepository.findAll();
    }
    @Override
    public List<SubjectDTO> filterSubject(Long id){
        return subjectRepository.filterSubject(id);
    }
}

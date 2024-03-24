package com.example.library.Repository;

import com.example.library.DTO.KnowledgeBlockDTO;
import com.example.library.Model.KnowledgeBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KnowledgeBlockRepository extends JpaRepository<KnowledgeBlock,Long> {
    @Query("SELECT NEW com.example.library.DTO.KnowledgeBlockDTO(k.blockId, k.blockName) FROM KnowledgeBlock k INNER JOIN k.department d WHERE d.departmentId = :departmentId")
    List<KnowledgeBlockDTO> findByDepartment(Long departmentId);
}

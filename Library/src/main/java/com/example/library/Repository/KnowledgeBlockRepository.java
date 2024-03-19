package com.example.library.Repository;

import com.example.library.Model.KnowledgeBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeBlockRepository extends JpaRepository<KnowledgeBlock,Long> {
}

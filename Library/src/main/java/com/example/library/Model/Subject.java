package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subject", uniqueConstraints = @UniqueConstraint(columnNames = "SubjectId"))
public class Subject{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SubjectID")
    private Long subjectId;

    @Column(name = "SubjectName", length = 255)
    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "BlockID")
    private KnowledgeBlock knowledgeBlock;
}

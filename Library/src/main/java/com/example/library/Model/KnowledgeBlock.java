package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "knowledgeblock", uniqueConstraints = @UniqueConstraint(columnNames = "BlockId"))
public class KnowledgeBlock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BlockID")
    private Long blockId;

    @Column(name = "BlockName", length = 255)
    private String blockName;

    @ManyToOne
    @JoinColumn(name = "DepartmentID")
    private Department department;
}

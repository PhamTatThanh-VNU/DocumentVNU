package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "document", uniqueConstraints = @UniqueConstraint(columnNames = "document_id"))
public class Document{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long documentId;

    @Column(name = "document_title", length = 255)
    private String documentTitle;

    @Column(name = "document_content")
    private String documentContent;

    @Lob
    @Column(name = "document_file")
    private String documentFile;

    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Column(name = "is_approved")
    private boolean isApproved;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}

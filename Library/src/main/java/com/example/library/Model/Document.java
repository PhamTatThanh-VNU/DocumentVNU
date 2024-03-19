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
@Table(name = "document", uniqueConstraints = @UniqueConstraint(columnNames = "DocumentID"))
public class Document{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DocumentID")
    private Long documentId;

    @Column(name = "DocumentTitle", length = 255)
    private String documentTitle;

    @Column(name = "DocumentContent")
    private String documentContent;

    @Lob
    @Column(name = "DocumentFile")
    private String documentFile;

    @Column(name = "DateCreated")
    private Timestamp dateCreated;

    @Column(name = "IsApproved")
    private boolean isApproved;

    @ManyToOne
    @JoinColumn(name = "SubjectID")
    private Subject subject;
}

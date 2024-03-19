package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin",uniqueConstraints = @UniqueConstraint(columnNames = "AdminId"))
public class Admin  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdminID")
    private Long adminId;

    @ManyToOne
    @JoinColumn(name = "StudentID")
    private Student student;
}

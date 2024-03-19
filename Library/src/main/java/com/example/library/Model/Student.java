package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student",uniqueConstraints = @UniqueConstraint(columnNames = "StudentId"))
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private Long studentId;

    @Column(name = "Username", length = 50)
    private String username;

    @Column(name = "Password", length = 255)
    private String password;

    @Column(name = "Email", length = 255)
    private String email;

    @Column(name = "FullName", length = 100)
    private String fullName;
}

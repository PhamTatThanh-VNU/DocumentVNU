package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin",uniqueConstraints = @UniqueConstraint(columnNames = "admin_id"))
public class Admin  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long adminId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}

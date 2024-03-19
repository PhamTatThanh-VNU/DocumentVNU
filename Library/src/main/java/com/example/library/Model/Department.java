package com.example.library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department",uniqueConstraints = @UniqueConstraint(columnNames = "DepartnameId"))
public class Department  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentId")
    private Long departmentId;

    @Column(name = "DepartmentName")
    private String departmentName;
}

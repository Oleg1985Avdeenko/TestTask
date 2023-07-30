package com.example.testtask.model.entity;

import javax.validation.constraints.Size;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min=2, max=20)
    private String name;
    @Size(min=2, max=40)
    private String surname;
    @Size(min=2, max=40)
    private String lastName;
    @Size(min=2, max=50)
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
}

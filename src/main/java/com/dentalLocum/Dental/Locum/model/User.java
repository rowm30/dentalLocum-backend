package com.dentalLocum.Dental.Locum.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Role role;

    @Column(nullable = true, length = 255)
    private String credentials; // Placeholder for credential details or references

    @Column(nullable = true)
    private String specialization; // Specific to locum dentists

    @Column(nullable = true)
    private String registrationNumber; // Medical or dental registration number if applicable

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date registrationDate = new Date(); // Auto set to current time on creation

    // Enum for user roles
    public enum Role {
        LOCUM, CLINIC, ADMIN
    }
}

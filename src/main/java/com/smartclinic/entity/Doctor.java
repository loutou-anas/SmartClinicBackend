package com.smartclinic.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;

    @ElementCollection
    private List<String> availableTimes;

    // Getters and Setters
}

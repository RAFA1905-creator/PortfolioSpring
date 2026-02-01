package com.rafael.portfolio.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "info")
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String fotoUrl;

    private String email;

    private String linkedin;

    private String github;
}

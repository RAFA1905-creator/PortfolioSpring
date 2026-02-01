package com.rafael.portfolio.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String puesto;

    private String empresa;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;
}

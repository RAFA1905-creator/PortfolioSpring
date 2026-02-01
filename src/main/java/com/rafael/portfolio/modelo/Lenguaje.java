package com.rafael.portfolio.modelo;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "lenguajes")
public class Lenguaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String iconoUrl;

    @ManyToMany(mappedBy = "lenguajes")
    private List<Proyecto> proyectos;
}

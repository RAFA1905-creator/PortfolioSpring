package com.rafael.portfolio.model;

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

    //Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIconoUrl() {
        return iconoUrl;
    }

    public void setIconoUrl(String iconoUrl) {
        this.iconoUrl = iconoUrl;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
}

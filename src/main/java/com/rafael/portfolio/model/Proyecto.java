package com.rafael.portfolio.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "proyectos")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String githubUrl;

    private String imagenUrl;

    private LocalDate fecha;

    @ManyToMany
    @JoinTable(
            name = "proyecto_lenguaje",
            joinColumns = @JoinColumn(name = "proyecto_id"),
            inverseJoinColumns = @JoinColumn(name = "lenguaje_id")
    )
    private List<Lenguaje> lenguajes;

    //Getters and setters
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }
}

package com.rafael.portfolio.repository;

import com.rafael.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}

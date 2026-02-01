package com.rafael.portfolio.repository;

import com.rafael.portfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudioRepository extends JpaRepository<Estudio, Long> {
}

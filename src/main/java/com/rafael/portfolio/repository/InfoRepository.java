package com.rafael.portfolio.repository;

import com.rafael.portfolio.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info, Long> {
}

package com.rafael.portfolio.service;

import com.rafael.portfolio.model.Experiencia;
import com.rafael.portfolio.repository.ExperienciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService {

    private final ExperienciaRepository repo;

    public ExperienciaService(ExperienciaRepository repo) {
        this.repo = repo;
    }

    public List<Experiencia> findAll() {
        return repo.findAll();
    }

    public Experiencia findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Experiencia save(Experiencia exp) {
        return repo.save(exp);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

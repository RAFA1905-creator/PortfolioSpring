package com.rafael.portfolio.service;

import com.rafael.portfolio.model.Proyecto;
import com.rafael.portfolio.repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private final ProyectoRepository repo;

    public ProyectoService(ProyectoRepository repo) {
        this.repo = repo;
    }

    public List<Proyecto> findAll() {
        return repo.findAll();
    }

    public Proyecto findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Proyecto save(Proyecto proyecto) {
        return repo.save(proyecto);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

package com.rafael.portfolio.service;

import com.rafael.portfolio.model.Lenguaje;
import com.rafael.portfolio.repository.LenguajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LenguajeService {

    private final LenguajeRepository repo;

    public LenguajeService(LenguajeRepository repo) {
        this.repo = repo;
    }

    public List<Lenguaje> findAll() {
        return repo.findAll();
    }

    public Lenguaje findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Lenguaje save(Lenguaje lenguaje) {
        return repo.save(lenguaje);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

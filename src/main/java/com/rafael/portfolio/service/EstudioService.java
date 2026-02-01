package com.rafael.portfolio.service;

import com.rafael.portfolio.model.Estudio;
import com.rafael.portfolio.repository.EstudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudioService {

    private final EstudioRepository repo;

    public EstudioService(EstudioRepository repo) {
        this.repo = repo;
    }

    public List<Estudio> findAll() {
        return repo.findAll();
    }

    public Estudio findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Estudio save(Estudio estudio) {
        return repo.save(estudio);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

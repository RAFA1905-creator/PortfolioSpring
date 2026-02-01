package com.rafael.portfolio.service;

import com.rafael.portfolio.model.Info;
import com.rafael.portfolio.repository.InfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    private final InfoRepository repo;

    public InfoService(InfoRepository repo) {
        this.repo = repo;
    }

    public List<Info> findAll() {
        return repo.findAll();
    }

    public Info findFirst() {
        return repo.findAll().stream().findFirst().orElse(null);
    }

    public Info findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Info save(Info info) {
        return repo.save(info);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

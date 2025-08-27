package com.synergy.service;

import com.synergy.model.Integration;
import com.synergy.repository.IntegrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrationService {

    private final IntegrationRepository repository;

    @Autowired
    public IntegrationService(IntegrationRepository repository) {
        this.repository = repository;
    }

    public List<Integration> findAll() {
        return repository.findAll();
    }

    public Integration findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Integration save(Integration integration) {
        return repository.save(integration);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
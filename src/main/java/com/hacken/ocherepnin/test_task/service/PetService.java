package com.hacken.ocherepnin.test_task.service;

import com.hacken.ocherepnin.test_task.domain.Pet;
import com.hacken.ocherepnin.test_task.repository.PetRepository;
import com.hacken.ocherepnin.test_task.util.LocalCSVParser;
import com.hacken.ocherepnin.test_task.util.PetSpecification;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class PetService {

    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> save(String file) throws IOException {
        List<Pet> parsed = LocalCSVParser.parse(file);
        return repository.saveAll(parsed);
    }

    @Transactional
    public List<Pet> searchPets(String param) {
        return repository.findAll(PetSpecification.petsMatchingSearchTerm(param));
    }
}

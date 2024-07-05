package com.hacken.ocherepnin.test_task.controller;

import com.hacken.ocherepnin.test_task.domain.Pet;
import com.hacken.ocherepnin.test_task.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    @PostMapping("/upload")
    public List<Pet> upload(@RequestBody String file) {
        try {
            return service.save(file);
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not upload the file! " + e);
        }
    }

    @GetMapping("/search")
    public List<Pet> searchPets(@RequestParam String param) {
        return service.searchPets(param);
    }
}

package com.hacken.ocherepnin.test_task.repository;

import com.hacken.ocherepnin.test_task.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface PetRepository extends JpaRepository<Pet, UUID>, JpaSpecificationExecutor<Pet> {
//    List<Pet> findAllBySearchQuery(String query);
}

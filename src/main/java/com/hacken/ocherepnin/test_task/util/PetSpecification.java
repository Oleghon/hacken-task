package com.hacken.ocherepnin.test_task.util;

import com.hacken.ocherepnin.test_task.domain.Pet;
import org.springframework.data.jpa.domain.Specification;

public class PetSpecification {

    public static Specification<Pet> petsMatchingSearchTerm(String searchTerm) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.or(
                criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + searchTerm.toLowerCase() + "%"),
                criteriaBuilder.like(criteriaBuilder.lower(root.get("breed")), "%" + searchTerm.toLowerCase() + "%"),
                criteriaBuilder.like(criteriaBuilder.lower(root.get("description")), "%" + searchTerm.toLowerCase() + "%"),
                criteriaBuilder.like(criteriaBuilder.trim(root.get("description")), "%" + searchTerm.toLowerCase() + "%")
        );
    }
}
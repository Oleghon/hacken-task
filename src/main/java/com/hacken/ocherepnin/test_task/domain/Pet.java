package com.hacken.ocherepnin.test_task.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
//import org.hibernate.search.annotations.Field;
import org.springframework.stereotype.Indexed;

import java.util.UUID;

@Entity
@Indexed
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "pets")
public class Pet {
    @Id
    private UUID id = UUID.randomUUID();

    @NonNull
    private String name;

    @NonNull
    private String breed;

    @NonNull
    private int age;

    @NonNull
    private int weight;

    @NonNull
    private String description;
}

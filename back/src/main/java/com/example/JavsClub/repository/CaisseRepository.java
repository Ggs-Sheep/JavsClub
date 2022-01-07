package com.example.JavsClub.repository;

import com.example.JavsClub.model.Caisse;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CaisseRepository extends CrudRepository<Caisse, Long> {
    public Caisse findCaisseById(Long id);

}

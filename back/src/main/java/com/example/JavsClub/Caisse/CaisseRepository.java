package com.example.JavsClub.Caisse;

import com.example.JavsClub.Caisse.Caisse;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CaisseRepository extends CrudRepository<Caisse, Long> {
    Optional<Caisse> findById(Long id);

}

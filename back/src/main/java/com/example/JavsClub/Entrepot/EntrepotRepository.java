package com.example.JavsClub.Entrepot;

import com.example.JavsClub.Entrepot.Entrepot;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EntrepotRepository extends CrudRepository<Entrepot, Long> {
    Optional<Entrepot> findById(Long id);

}

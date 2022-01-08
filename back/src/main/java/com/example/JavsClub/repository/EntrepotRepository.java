package com.example.JavsClub.repository;

import com.example.JavsClub.model.Entrepot;
import org.springframework.data.repository.CrudRepository;

public interface EntrepotRepository extends CrudRepository<Entrepot, Long> {
    public Entrepot findEntrepotById(Long id);
    public void deleteEntrepotById(Long id);
}

package com.example.JavsClub.repository;

import com.example.JavsClub.model.Cigare;
import org.springframework.data.repository.CrudRepository;

public interface CigareRepository extends CrudRepository<Cigare, Long> {
    public Cigare findCigareById(Long id);
    public void deleteCigareById(Long id);
}

package com.example.JavsClub.repository;

import com.example.JavsClub.model.Whisky;
import org.springframework.data.repository.CrudRepository;

public interface WhiskyRepository extends CrudRepository<Whisky, Long> {
    public Whisky findWhiskyById(Long id);
    public void deleteWhiskyById(Long id);
}

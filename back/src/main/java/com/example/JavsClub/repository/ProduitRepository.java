package com.example.JavsClub.repository;

import com.example.JavsClub.model.Produit;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProduitRepository extends CrudRepository<Produit, Long> {
    Optional<Produit> findById(Long id);

}

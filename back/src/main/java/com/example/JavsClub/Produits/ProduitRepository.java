package com.example.JavsClub.Produits;

import com.example.JavsClub.Produits.Produit;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProduitRepository extends CrudRepository<Produit, Long> {
    Optional<Produit> findById(Long id);

}

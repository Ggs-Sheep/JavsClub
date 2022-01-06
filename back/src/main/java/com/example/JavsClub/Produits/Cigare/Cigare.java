package com.example.JavsClub.Produits.Cigare;

import com.example.JavsClub.Produits.Produit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cigare extends Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Cigare(String nom, int qte,String type) {
        super(nom,qte,type);
    }

    public Cigare(){}
}

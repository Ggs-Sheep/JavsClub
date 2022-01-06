package com.example.JavsClub.Produits.Whisky;

import com.example.JavsClub.Produits.Produit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Whisky extends Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Whisky(String nom, int qte,String type) {
        super(nom,qte,type);
    }

    public Whisky(){}
}
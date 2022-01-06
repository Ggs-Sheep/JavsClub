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
    private String type;

    public Cigare(String nom, String paysProvenance, long prixVente, long prixAchat,String libelle, String description, String type) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description);
        this.type = type;
    }

    public Cigare() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

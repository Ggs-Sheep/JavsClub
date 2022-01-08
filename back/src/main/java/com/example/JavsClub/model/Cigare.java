package com.example.JavsClub.model;

import com.example.JavsClub.model.Produit;

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

    public Cigare(String nom, String paysProvenance, long prixVente, long prixAchat, String libelle, String description, Caisse caisse, String type) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description, caisse);
        this.type = type;
    }

    public Cigare(String nom, String paysProvenance, long prixVente, long prixAchat, String libelle, String description, Caisse caisse) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description, caisse);
        this.type = "unknown";
    }

    public Cigare(){
        this.type = "unknown";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

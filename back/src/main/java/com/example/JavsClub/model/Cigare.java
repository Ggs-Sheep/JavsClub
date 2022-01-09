package com.example.JavsClub.model;

import com.example.JavsClub.model.Produit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cigare extends Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    private String type;

    public Cigare(String nom, String paysProvenance, long prixVente, long prixAchat, String libelle, String description, String imgPath, String type) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description, imgPath);
        this.type = type;
    }

    public Cigare(String nom, String paysProvenance, long prixVente, long prixAchat, String libelle, String imgPath, String description) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description, imgPath);
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

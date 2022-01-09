package com.example.JavsClub.model;

import com.example.JavsClub.model.Produit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Whisky extends Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    private int contenance;

    public Whisky(String nom, String paysProvenance, long prixVente, long prixAchat, String libelle, String description, String imgPath) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description, imgPath);
    }

    public Whisky(){
        this.contenance = 75;
    }

    public int getContenance() {
        return contenance;
    }

    public void setContenance(int contenance) {
        this.contenance = contenance;
    }
}

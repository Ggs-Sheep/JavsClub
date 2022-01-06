package com.example.JavsClub.Produits.Vin;

import com.example.JavsClub.Produits.Produit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Vin extends Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int contenance;

    public Vin(String nom, String paysProvenance, long prixVente, long prixAchat, String libelle, String description, int contenance) {
        super(nom, paysProvenance, prixVente, prixAchat, libelle, description);
        this.contenance = contenance;
    }

    public Vin() {

    }

    public int getContenance() {
        return contenance;
    }

    public void setContenance(int contenance) {
        this.contenance = contenance;
    }
}

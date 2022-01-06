package com.example.JavsClub.Entrepot;

import com.example.JavsClub.Produits.Produit;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Entrepot implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private List<Produit> produits;
    private int capacite;

    public Entrepot(List<Produit> produits, int capacite) {
        super();
        this.produits = produits;
        this.capacite = capacite;
    }

    public Entrepot(int capacite) {
        super();
        this.produits = new ArrayList<Produit>();
        this.capacite = capacite;
    }

    public Entrepot(){
        super();
        this.produits = new ArrayList<Produit>();
        this.capacite = 1000;
    }

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return this.produits;
    }

    public void addProduit(Produit produit) {
        this.produits.add(produit);
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getStorageUsed(){
        int storageUsed = 0;
        for (Produit produit: this.produits) {
            storageUsed = storageUsed + produit.getQte();
        }
        return storageUsed;
    }
}

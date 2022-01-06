package com.example.JavsClub.Produits;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public abstract class Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private int qte;
    private String type;

    public Produit() {
        super();
    }

    public Produit(String nom, int qte, String type) {
        this.nom = nom;
        this.qte = qte;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {this.type = type;}
}


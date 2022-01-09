package com.example.JavsClub.model;

import com.example.JavsClub.controller.CaisseRessource;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public abstract class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String paysProvenance;
    private long prixAchat;
    private long prixVente;
    private String libelle;
    private String description;
    private String imgPath;

    @JsonBackReference
    @ManyToOne
    private Caisse caisse;

    public Produit(String nom, String paysProvenance, long prixAchat, long prixVente, String libelle, String description, String imgPath) {
        this.nom = nom;
        this.paysProvenance = paysProvenance;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.libelle = libelle;
        this.description = description;
        this.imgPath = imgPath;
    }

    public Produit() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaysProvenance() {
        return this.paysProvenance;
    }

    public void setPaysProvenance(String type) {this.paysProvenance = type;}

    public long getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(long prixAchat) {
        this.prixAchat = prixAchat;
    }

    public long getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(long prixVente) {
        this.prixVente = prixVente;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}


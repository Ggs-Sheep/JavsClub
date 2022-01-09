package com.example.JavsClub.model;

import com.example.JavsClub.controller.EntrepotRessource;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Caisse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String provenance;
    private Date dateArrivee;
    private Date dateCommande;

    @JsonManagedReference
    @OneToMany(mappedBy = "caisse", fetch = FetchType.EAGER)
    private List<Produit> produits = new ArrayList<>();

    @JsonBackReference
    @ManyToOne
    private Entrepot entrepot;

    public Caisse() {
    }

    public Caisse(String provenance, Date dateArrivee, Date dateCommande, List<Produit> produits) {
        this.provenance = provenance;
        this.dateArrivee = dateArrivee;
        this.dateCommande = dateCommande;
        this.produits = produits;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String nom) {
        this.provenance = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public void addProduit(Produit produit) {
        this.produits.add(produit);
    }

    public Entrepot getEntrepot() {
        return entrepot;
    }

    public void setEntrepot(Entrepot entrepot) {
        this.entrepot = entrepot;
    }

}



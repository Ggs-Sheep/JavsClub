package com.example.JavsClub.Caisse;

import com.example.JavsClub.Produits.Produit;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public abstract class Caisse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String provenance;
    private Date dateArrivee;
    private Date dateCommande;
    @OneToMany
    private List<Produit> produits;

    public Caisse() {
        super();
    }

    public Caisse(String provenance, int qte, Date dateArrivee, Date dateCommande) {
        this.provenance = provenance;
        this.dateArrivee = dateArrivee;
        this.dateCommande = dateCommande;
        this.produits = new ArrayList<Produit>();
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
}



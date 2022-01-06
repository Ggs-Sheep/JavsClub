package com.example.JavsClub.Entrepot;

import com.example.JavsClub.Caisse.Caisse;
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
    private List<Caisse> caisses;
    private int capacite;

    public Entrepot(List<Caisse> caisses, int capacite) {
        super();
        this.caisses = caisses;
        this.capacite = capacite;
    }

    public Entrepot(int capacite) {
        super();
        this.caisses = new ArrayList<Caisse>();
        this.capacite = capacite;
    }

    public Entrepot(){
        super();
        this.caisses = new ArrayList<Caisse>();
        this.capacite = 1000;
    }

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public List<Caisse> getCaisses() {
        return this.caisses;
    }

    public void addCaisse(Caisse caisse) {
        this.caisses.add(caisse);
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getStorageUsed(){
        return this.caisses.size();
    }

    public int getStorageRemaining(){
        return this.capacite - getStorageUsed();
    }
}

package com.example.JavsClub.model;

import com.example.JavsClub.model.Caisse;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Entrepot implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int capacite;

    @JsonManagedReference
    @OneToMany(mappedBy = "entrepot", fetch = FetchType.EAGER)
    private List<Caisse> caisses = new ArrayList<>();

    public Entrepot(String name,int capacite) {
        this.name = name;
        this.caisses = new ArrayList<Caisse>();
        this.capacite = capacite;
    }

    public Entrepot(){
        this.caisses = new ArrayList<Caisse>();
        this.capacite = 1000;
        this.name = "undefined-entrepot";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

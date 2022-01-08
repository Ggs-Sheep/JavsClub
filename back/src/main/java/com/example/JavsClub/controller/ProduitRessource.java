package com.example.JavsClub.controller;

import com.example.JavsClub.model.Produit;
import com.example.JavsClub.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("produit")
public class ProduitRessource {

    @GET
    @Path(("produit/{id}"))
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Produit> findProduitById(@QueryParam("id") Long id) {
        Optional<Produit> p = produitRepository.findById(id);
        return p;
    }

    @Autowired
    private ProduitRepository produitRepository;
    @POST
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Produit createProduit(Produit p) {
        return produitRepository.save(p); }
}

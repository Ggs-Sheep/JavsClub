package com.example.JavsClub.Produits;

import com.example.JavsClub.Produits.Produit;
import com.example.JavsClub.Produits.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("produit")
public class ProduitRessource {

    @GET
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

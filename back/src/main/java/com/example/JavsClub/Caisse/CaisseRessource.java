package com.example.JavsClub.Caisse;

import com.example.JavsClub.Caisse.Caisse;
import com.example.JavsClub.Caisse.CaisseRepository;
import com.example.JavsClub.Produits.Produit;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("caisse")
public class CaisseRessource {

    @GET
    @Path("caisse/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Caisse> findCaisseById(@QueryParam("id") Long id) {
        Optional<Caisse> c = caisseRepository.findById(id);
        return c;
    }

    @Autowired
    private CaisseRepository caisseRepository;
    @POST
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Caisse createCaisse(Caisse c) {
        return caisseRepository.save(c); }

}

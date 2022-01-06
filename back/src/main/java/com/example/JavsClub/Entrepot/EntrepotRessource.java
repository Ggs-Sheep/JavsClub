package com.example.JavsClub.Entrepot;

import com.example.JavsClub.Entrepot.Entrepot;
import com.example.JavsClub.Entrepot.EntrepotRepository;
import com.example.JavsClub.Produits.Produit;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("entrepot")
public class EntrepotRessource {

    @GET
    @Path("entrepot/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Entrepot> findEntrepotById(@QueryParam("id") Long id) {
        Optional<Entrepot> e = entrepotRepository.findById(id);
        return e;
    }

    @Autowired
    private EntrepotRepository entrepotRepository;
    @POST
    @Path("entrepot")
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Entrepot createEntrepot(Entrepot e) {
        return entrepotRepository.save(e); }

}

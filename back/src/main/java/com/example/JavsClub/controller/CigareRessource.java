package com.example.JavsClub.controller;

import com.example.JavsClub.model.Cigare;
import com.example.JavsClub.repository.CaisseRepository;
import com.example.JavsClub.repository.CigareRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("cigare")
public class CigareRessource {

    @Autowired
    private CaisseRepository caisseRepository;

    @Autowired
    private CigareRepository cigareRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cigare> getAllCigare(){return (List<Cigare>) cigareRepository.findAll();}


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Cigare> findCigareById(@PathParam("id") Long id) {
        Optional<Cigare> c = cigareRepository.findById(id);
        return c;
    }

    @POST
    @Path("/{id_caisse}")
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Cigare createWhisky(Cigare c, @PathParam("id_caisse") Long id_caisse) {
        caisseRepository.findCaisseById(id_caisse).addProduit(c);
        c.setCaisse(caisseRepository.findCaisseById(id_caisse));
        return cigareRepository.save(c);
    }

    @DELETE
    @Path("/{id}")
    public void deleteCigareById(@PathParam("id") Long id) {
        Cigare c = cigareRepository.findCigareById(id);
        cigareRepository.delete(c);
    }


}

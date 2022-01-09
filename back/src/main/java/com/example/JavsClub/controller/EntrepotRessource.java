package com.example.JavsClub.controller;

import com.example.JavsClub.model.Entrepot;
import com.example.JavsClub.repository.EntrepotRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("entrepot")
public class EntrepotRessource {

    @Autowired
    private EntrepotRepository entrepotRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entrepot> getAllEntrepot(){return (List<Entrepot>) entrepotRepository.findAll();}


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Entrepot> findEntrepotById(@PathParam("id") Long id) {
        Optional<Entrepot> e = entrepotRepository.findById(id);
        return e;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Entrepot createEntrepot(Entrepot e) {
         return entrepotRepository.save(e);
    }

    @DELETE
    @Path("/{id}")
    public void deleteEntrepotById(@PathParam("id") Long id) {
       Entrepot e = entrepotRepository.findEntrepotById(id);
       entrepotRepository.delete(e);
    }
}

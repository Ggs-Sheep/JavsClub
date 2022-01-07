package com.example.JavsClub.controller;

import com.example.JavsClub.model.Caisse;
import com.example.JavsClub.model.Entrepot;
import com.example.JavsClub.repository.CaisseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("caisse")
public class CaisseRessource {

    @Autowired
    private CaisseRepository caisseRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Caisse> getAllCaisse(){return (List<Caisse>) caisseRepository.findAll();}


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Caisse> findCaisseById(@QueryParam("id") Long id) {
        Optional<Caisse> c = caisseRepository.findById(id);
        return c;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Caisse createCaisse(Caisse c) {
        return caisseRepository.save(c);
    }

    @DELETE
    @Path("/{id}")
    public void deleteCaisseById(@QueryParam("id") Long id) {
        Caisse e = caisseRepository.findCaisseById(id);
        caisseRepository.delete(e);
    }


}

package com.example.JavsClub.controller;

import com.example.JavsClub.model.Whisky;
import com.example.JavsClub.repository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("whisky")
public class WhiskyRessource {

    @Autowired
    private WhiskyRepository whiskyRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Whisky> getAllWhisky(){return (List<Whisky>) whiskyRepository.findAll();}


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Whisky> findWhiskyById(@QueryParam("id") Long id) {
        Optional<Whisky> w = whiskyRepository.findById(id);
        return w;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Whisky createWhisky(Whisky w) {
        return whiskyRepository.save(w);
    }

    @DELETE
    @Path("/{id}")
    public void deleteWhiskyById(@QueryParam("id") Long id) {
        Whisky e = whiskyRepository.findWhiskyById(id);
        whiskyRepository.delete(e);
    }


}

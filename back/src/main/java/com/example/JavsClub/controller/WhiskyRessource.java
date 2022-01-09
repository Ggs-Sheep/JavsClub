package com.example.JavsClub.controller;

import com.example.JavsClub.model.Whisky;
import com.example.JavsClub.repository.CaisseRepository;
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

    @Autowired
    private CaisseRepository caisseRepository;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Whisky> getAllWhisky(){return (List<Whisky>) whiskyRepository.findAll();}


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Whisky> findWhiskyById(@PathParam("id") Long id) {
        Optional<Whisky> w = whiskyRepository.findById(id);
        return w;
    }

    @POST
    @Path("/{id_caisse}")
    @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
    public Whisky createWhisky(Whisky w,@PathParam("id_caisse") Long id_caisse) {
        caisseRepository.findCaisseById(id_caisse).addProduit(w);
        w.setCaisse(caisseRepository.findCaisseById(id_caisse));
        return whiskyRepository.save(w);
    }

    @DELETE
    @Path("/{id}")
    public void deleteWhiskyById(@PathParam("id") Long id) {
        Whisky e = whiskyRepository.findWhiskyById(id);
        whiskyRepository.delete(e);
    }


}

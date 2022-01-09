package com.example.JavsClub;

import com.example.JavsClub.controller.*;
import com.example.JavsClub.repository.CigareRepository;
import com.example.JavsClub.repository.CorsFilter;
import com.example.JavsClub.repository.WhiskyRepository;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("javsclub")
@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(CaisseRessource.class);
        register(ProduitRessource.class);
        register(EntrepotRessource.class);
        register(WhiskyRessource.class);
        register(CigareRessource.class);
        register(CorsFilter.class);
        System.out.println("Cors filter enable");
    }
}

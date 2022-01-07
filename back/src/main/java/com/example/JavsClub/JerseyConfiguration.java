package com.example.JavsClub;

import com.example.JavsClub.controller.CaisseRessource;
import com.example.JavsClub.controller.EntrepotRessource;
import com.example.JavsClub.controller.ProduitRessource;
import com.example.JavsClub.repository.CigareRepository;
import com.example.JavsClub.repository.WhiskyRepository;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("javsclub")
@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(CaisseRessource.class);
        register(ProduitRessource.class);
        register(EntrepotRessource.class);
        register(WhiskyRepository.class);
        register(CigareRepository.class);
    }
}

package com.example.JavsClub;

import com.example.JavsClub.Entrepot.EntrepotRessource;
import com.example.JavsClub.Produits.ProduitRessource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("javsclub")
@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(ProduitRessource.class);
        register(EntrepotRessource.class);
    }
}

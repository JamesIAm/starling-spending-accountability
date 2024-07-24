package org.nahajski.startspac.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;

//@Configuration
public class StarlingClientRegistration {
//    @Bean
    ClientRegistration createStarlingClient(StarlingOauthConfig starlingOauthConfig) {
        return ClientRegistration
                .withRegistrationId("Starling")
                .clientId(starlingOauthConfig.clientId())
                .build();
    }



}

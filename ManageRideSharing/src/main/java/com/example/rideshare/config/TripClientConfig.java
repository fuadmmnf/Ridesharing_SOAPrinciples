package com.example.rideshare.config;

import com.example.rideshare.clients.TripClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class TripClientConfig {

        @Bean
        public Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.example.rideshare.gen");
            return marshaller;
        }
        @Bean
        public TripClient tripClient(Jaxb2Marshaller marshaller) {
            TripClient client = new TripClient();
            client.setDefaultUri("http://localhost:8080/ws/trip");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
        }

}

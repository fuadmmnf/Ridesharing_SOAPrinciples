package com.example.rideshare.repositories;


import com.example.rideshare.gen.Country;
import com.example.rideshare.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country country = new Country();
        country.setName("Spain");
        country.setPopulation(46704314);
        country.setCapital("Madrid");
        country.setCurrency(Currency.EUR);
        countries.put("Spain", country);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}

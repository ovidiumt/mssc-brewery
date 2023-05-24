package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerSerivce {
    BeerDto getBeerById(UUID beerID);
}

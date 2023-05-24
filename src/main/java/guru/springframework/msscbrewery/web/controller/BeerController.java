package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerSerivce;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerSerivce beerSerivce;

    public BeerController(BeerSerivce beerSerivce) {
        this.beerSerivce = beerSerivce;
    }

    @GetMapping({"beerId"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerID){

        return new ResponseEntity<>(beerSerivce.getBeerById(beerID), HttpStatus.OK);
    }
}

package ge.softlab.onlinestore.controllers;

import ge.softlab.onlinestore.entities.Country;
import ge.softlab.onlinestore.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/countries")
public class CountryController {

    private final CountryService countryService;


    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
}
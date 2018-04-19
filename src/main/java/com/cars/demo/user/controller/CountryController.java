package com.cars.demo.user.controller;

import com.cars.demo.user.dao.CountryRepository;
import com.cars.demo.user.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/{id}")
    public Country findById(@PathVariable Long id){
        Country country = countryRepository.findOne(id);
        return country;
    }
}

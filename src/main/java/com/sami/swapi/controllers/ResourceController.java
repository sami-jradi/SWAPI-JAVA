package com.sami.swapi.controllers;

import com.sami.swapi.DTOs.PeopleDTO;
import com.sami.swapi.DTOs.StarshipDTO;
import com.sami.swapi.services.InhabitantsService;
import com.sami.swapi.services.StarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceController {

    @Autowired
    private StarshipService starshipService;

    @Autowired
    private InhabitantsService inhabitantsService;

    @GetMapping("/starship/{characterName}")
    public List<StarshipDTO> getStarshipByCharName(@PathVariable String characterName) {

        return starshipService.getStarshipsByCharacter(characterName);
    }

    @GetMapping("/inhabitants/{planetName}")
    public List<PeopleDTO> getInhabitantsByPlanetName(@PathVariable String planetName) {

        return inhabitantsService.getInhabitantsByPlanetName(planetName);
    }

}

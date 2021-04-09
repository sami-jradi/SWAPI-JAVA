package com.sami.swapi.services;

import com.sami.swapi.DTOs.PeopleDTO;

import java.util.List;

public interface InhabitantsService {
    List<PeopleDTO> getInhabitantsByPlanetName(String name);
}

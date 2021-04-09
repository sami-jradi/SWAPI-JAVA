package com.sami.swapi.services;

import com.sami.swapi.DTOs.StarshipDTO;

import java.util.List;

public interface StarshipService {

    List<StarshipDTO> getStarshipsByCharacter(String name);

}

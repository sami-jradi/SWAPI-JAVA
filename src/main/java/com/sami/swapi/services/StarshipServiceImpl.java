package com.sami.swapi.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sami.swapi.DTOs.StarshipDTO;
import com.sami.swapi.mapper.ModelMapper;
import com.sami.swapi.models.ModelResult;
import com.sami.swapi.models.People;
import com.sami.swapi.models.Starship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StarshipServiceImpl implements StarshipService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<StarshipDTO> getStarshipsByCharacter(String name) {

        String uri = "https://swapi.dev/api/people/?search=";

        ModelResult modelResult = restTemplate.getForObject(uri + name, ModelResult.class);

        if (modelResult.getCount() > 1) {
            throw new RuntimeException("More than one character found with the same name!");
        } else if (modelResult.getCount() == 0) {
            throw new RuntimeException("No characters found!");
        }

        ObjectMapper mapper = new ObjectMapper();

        List<People> characters = mapper.convertValue(modelResult.getResults(), new TypeReference<List<People>>() {
        });

        List<String> starshipUriList = new ArrayList<>();

        List<StarshipDTO> starshipList = new ArrayList<>();

        starshipUriList = Arrays.asList(characters.get(0).getStarships());

        for (String starshipUri : starshipUriList) {
            starshipList.add(modelMapper.toStarshipDto(getStarshipByUri(starshipUri)));
        }

        return starshipList;
    }

    private Starship getStarshipByUri(String uri) {

        String s = uri.substring(0,4) + "s" + uri.substring(4);

        Starship starship = restTemplate.getForObject(s, Starship.class);

        return starship;
    }
}

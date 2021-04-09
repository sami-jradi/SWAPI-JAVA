package com.sami.swapi.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sami.swapi.DTOs.PeopleDTO;
import com.sami.swapi.mapper.ModelMapper;
import com.sami.swapi.models.ModelResult;
import com.sami.swapi.models.People;
import com.sami.swapi.models.Planets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class InhabitantsServiceImpl implements InhabitantsService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PeopleDTO> getInhabitantsByPlanetName(String name) {

        String uri = "https://swapi.dev/api/planets/?search=";

        ModelResult modelResult = restTemplate.getForObject(uri + name, ModelResult.class);

        if (modelResult.getCount() > 1) {
            throw new RuntimeException("More than one planet found with the same name!");
        } else if (modelResult.getCount() == 0) {
            throw new RuntimeException("No planets found!");
        }

        ObjectMapper mapper = new ObjectMapper();

        List<Planets> planets = mapper.convertValue(modelResult.getResults(), new TypeReference<List<Planets>>() {});

        List<String> peopleUriList = new ArrayList<>();

        List<PeopleDTO> inhabitants = new ArrayList<>();

        for (Planets planet : planets) {
            peopleUriList = planet.getResidents();
        }

        for (String peopleUri : peopleUriList) {
            inhabitants.add(modelMapper.toPeopleDto(getInhabitantByUri(peopleUri)));
        }

        return inhabitants;
    }

    private People getInhabitantByUri(String uri) {

        String s = uri.substring(0,4) + "s" + uri.substring(4);

        People inhabitant = restTemplate.getForObject(s, People.class);

        return inhabitant;
    }
}

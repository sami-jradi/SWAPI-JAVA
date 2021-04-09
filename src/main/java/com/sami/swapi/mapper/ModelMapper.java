package com.sami.swapi.mapper;

import com.sami.swapi.DTOs.PeopleDTO;
import com.sami.swapi.DTOs.StarshipDTO;
import com.sami.swapi.models.People;
import com.sami.swapi.models.Starship;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ModelMapper {

    public PeopleDTO toPeopleDto(People people) {
        if ( people == null ) {
            return null;
        }

        PeopleDTO peopleDTO = new PeopleDTO();

        peopleDTO.setName( people.getName() );
        peopleDTO.setHeight( people.getHeight() );
        peopleDTO.setGender( people.getGender() );
        peopleDTO.setSkinColor( people.getSkin_color() );
        peopleDTO.setEdited( people.getEdited() );
        peopleDTO.setCreated( people.getCreated() );
        peopleDTO.setMass( people.getMass() );
        peopleDTO.setHairColor( people.getHair_color() );
        peopleDTO.setBirthYear( people.getBirth_year() );
        peopleDTO.setEyeColor( people.getEye_color() );
        peopleDTO.setUrl( people.getUrl() );
        String[] starships = people.getStarships();
        if ( starships != null ) {
            peopleDTO.setStarships( Arrays.copyOf( starships, starships.length ) );
        }

        return peopleDTO;
    }

    public StarshipDTO toStarshipDto(Starship starship) {
        if ( starship == null ) {
            return null;
        }

        StarshipDTO starshipDTO = new StarshipDTO();

        starshipDTO.setName( starship.getName() );
        starshipDTO.setModel( starship.getModel() );
        starshipDTO.setMaxAtmospheringSpeed( starship.getMax_atmosphering_speed() );
        starshipDTO.setCargoCapacity( starship.getCargo_capacity() );
        starshipDTO.setPassengers( starship.getPassengers() );
        starshipDTO.setEdited( starship.getEdited() );
        starshipDTO.setConsumables( starship.getConsumables() );
        starshipDTO.setMGLT( starship.getMGLT() );
        starshipDTO.setCreated( starship.getCreated() );
        starshipDTO.setLength( starship.getLength() );
        starshipDTO.setStarshipClass( starship.getStarship_class() );
        starshipDTO.setManufacturer( starship.getManufacturer() );
        starshipDTO.setCrew( starship.getCrew() );
        starshipDTO.setHyperdriveRating( starship.getHyperdrive_rating() );
        starshipDTO.setCostInCredits( starship.getCost_in_credits() );
        starshipDTO.setUrl( starship.getUrl() );

        return starshipDTO;
    }
}

package com.sami.swapi.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties("url")
public class StarshipDTO {

    String name;

    String model;

    String maxAtmospheringSpeed;

    String cargoCapacity;

    String passengers;

    String edited;

    String consumables;

    String MGLT;

    String created;

    String length;

    String starshipClass;

    String manufacturer;

    String crew;

    String hyperdriveRating;

    String costInCredits;

    String url;
}

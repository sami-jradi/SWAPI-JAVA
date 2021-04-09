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

    String max_atmosphering_speed;

    String cargo_capacity;

    String passengers;

    String edited;

    String consumables;

    String MGLT;

    String created;

    String length;

    String starship_class;

    String manufacturer;

    String crew;

    String hyperdrive_rating;

    String cost_in_credits;

    String url;
}

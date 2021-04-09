package com.sami.swapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Starship {

    private String name;

    private String model;

    private String max_atmosphering_speed;

    private String cargo_capacity;

    private String passengers;

    private String edited;

    private String consumables;

    private String MGLT;

    private String created;

    private String length;

    private String starship_class;

    private String url;

    private String manufacturer;

    private String crew;

    private String hyperdrive_rating;

    private String cost_in_credits;
}

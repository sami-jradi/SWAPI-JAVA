package com.sami.swapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Planets {

    String climate;

    String diameter;

    String gravity;

    String name;

    String orbital_period;

    String population;

    List<String> residents;

    String rotation_period;

    String surface_water;

    String terrain;

    @JsonIgnore
    String url;
}

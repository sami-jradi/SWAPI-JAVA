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
public class People {

    private String name;

    private String height;

    private String gender;

    private String skin_color;

    private String edited;

    private String created;

    private String mass;

    private String url;

    private String hair_color;

    private String birth_year;

    private String eye_color;

    private String[] starships;

}

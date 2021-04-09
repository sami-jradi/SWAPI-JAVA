package com.sami.swapi.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"url", "starships"})
public class PeopleDTO {

    String name;

    String height;

    String gender;

    String skin_color;

    String edited;

    String created;

    String mass;

    String hair_color;

    String birth_year;

    String eye_color;

    String url;

    String[] starships;
}

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

    String skinColor;

    String edited;

    String created;

    String mass;

    String hairColor;

    String birthYear;

    String eyeColor;

    String url;

    String[] starships;
}

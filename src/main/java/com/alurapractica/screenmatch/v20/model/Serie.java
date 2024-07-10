package com.alurapractica.screenmatch.v20.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record Serie(

        @JsonAlias("Title") String title,
        Integer totalSeasons,
        @JsonAlias("imdbRating") String rating) {
}

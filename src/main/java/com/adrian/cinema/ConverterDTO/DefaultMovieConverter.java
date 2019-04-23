package com.adrian.cinema.ConverterDTO;

import com.adrian.cinema.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class DefaultMovieConverter implements BaseConverter<Movie, MovieDTO> {

    @Override
    public MovieDTO convert(Movie form){
        MovieDTO movie = new MovieDTO();
        movie.setName(form.getName());
        movie.setAgeCategory(form.getAgeCategory());
        movie.setCast(form.getCast());
        movie.setDirection(form.getDirection());
        movie.setDuration(form.getDuration());
        movie.setDyscryption(form.getDyscryption());
        movie.setMovieId(form.getMovieId());
        movie.setPremiere(form.getPremiere());
        movie.setType(form.getType());
        movie.setScenario(form.getScenario());
        movie.setImgURL(form.getImgURL());
        return movie;
    }
}

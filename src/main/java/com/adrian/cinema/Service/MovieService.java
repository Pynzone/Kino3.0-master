package com.adrian.cinema.Service;

import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Movie;
import com.adrian.cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;


    public List<Movie>findAllMovie(){
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie movie)
    {
        return movieRepository.save(movie);
    }

    public Movie getMovieById( Long movieId)
    {
        return movieRepository.findById(movieId).
                orElseThrow(()-> new ResourceNotFoundException("Movie","id_movie",movieId));
    }

    public Movie updateMovie(Long movieId, Movie movieDetails)
    {
        Movie movie = movieRepository.
                findById(movieId).orElseThrow(()->new ResourceNotFoundException("Movie","id_movie",movieId));

        movie.setPremiere(movieDetails.getPremiere());
        movie.setType(movieDetails.getType());
        movie.setAgeCategory(movieDetails.getAgeCategory());
        movie.setDuration(movieDetails.getDuration());
        movie.setDirection(movieDetails.getDirection());
        movie.setCast(movieDetails.getCast());
        movie.setScenario(movieDetails.getScenario());
        movie.setDyscryption(movieDetails.getDyscryption());
        Movie updatedMovie = movieRepository.save(movie);
        return updatedMovie;

    }

    public ResponseEntity<?> deleteMovie(Long movieId)
    {
        Movie movie = movieRepository.findById(movieId).
                orElseThrow(()->new ResourceNotFoundException("Movie","id_movie",movieId));
        movieRepository.delete(movie);
        return ResponseEntity.ok().build();
    }
}

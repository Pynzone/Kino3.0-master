package com.adrian.cinema.controller;

import com.adrian.cinema.Service.MovieService;
import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Movie;
import com.adrian.cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService)
    {
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public List<Movie>findAllMovie()
    {
        return movieService.findAllMovie();
    }
    @PostMapping("/movie/create")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @GetMapping("/movie/{id_movie}")
    public Movie getMovieById(@PathVariable(value = "id_movie" )Long movieId)
    {
        return movieService.getMovieById(movieId);
    }

    @PutMapping("/movie/{id_movie}")
    public Movie updateMovie(@PathVariable(value = "id_movie" )Long movieId,@Valid @RequestBody Movie movieDetails)
    {
        return movieService.updateMovie(movieId, movieDetails);
    }
    @DeleteMapping("/movie/{id_movie}")
    public ResponseEntity<?> deleteMovie(@PathVariable(value = "id_movie" )Long movieId)
    {
        return movieService.deleteMovie(movieId);

    }
}








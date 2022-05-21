package pjwstk.kaswes.MovieService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import pjwstk.kaswes.MovieService.model.Movie;
import pjwstk.kaswes.MovieService.service.MovieService;

import java.util.List;

@Controller
public class MovieController {

    private final MovieService movieService;

    MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>>getAll(){
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> findById(@PathVariable("movieId") Long movieId) {
        return ResponseEntity.ok(movieService.findById(movieId).get());
    }
}

package pjwstk.kaswes.MovieService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @PutMapping("/movies")
    public ResponseEntity<Movie> update(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.update(movie));
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> save(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.update(movie));
    }


    @DeleteMapping("/movies/{movieId}")
    public ResponseEntity<Void> deleteById(@PathVariable("movieId") Long movieId) {
        movieService.deleteById(movieId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/movies/{movieId}")
    public ResponseEntity<Void> changeAvailable(@PathVariable("movieId") Long movieId){
        movieService.changeAvailable(movieId);
        return ResponseEntity.ok().build();
    }
}

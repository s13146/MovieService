package pjwstk.kaswes.MovieService.service;

import org.springframework.stereotype.Service;
import pjwstk.kaswes.MovieService.model.Movie;
import pjwstk.kaswes.MovieService.model.MovieCategory;
import pjwstk.kaswes.MovieService.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    public final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie update(Movie movie) {
        Optional<Movie> id = movieRepository.findById(movie.getId());
        if (id.isEmpty()) {
            throw new RuntimeException();
        } else {
            return movieRepository.save(movie);
        }
    }

    public void deleteById(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public void changeAvailable(Long movieId){
        movieRepository.changeAvailable(movieId);
    }



   // public List<Movie> getAllMovies() {
     //   Movie movie1 = new Movie(1L, "To", MovieCategory.HORROR);
    //    return List.of(movie1);
    // }

   // public void getMovieById(Long id) {
      //  Movie movie2 = new Movie(2L, "Killer", MovieCategory.COMEDY);
   // }
}

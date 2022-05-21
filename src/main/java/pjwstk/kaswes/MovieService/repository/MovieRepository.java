package pjwstk.kaswes.MovieService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pjwstk.kaswes.MovieService.model.Movie;

import java.util.Optional;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{


}

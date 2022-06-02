package pjwstk.kaswes.MovieService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pjwstk.kaswes.MovieService.model.Movie;

import java.util.List;
import java.util.Optional;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Modifying
    @Query("update Movie m set m.isAvailable = 1 where m.id = ?1")
    void changeAvailable(Long movieId);


    @Query("select m from Movie m where m.id=?1")
    Optional<Movie> findById(Long movieId);

    @Query("select m from Movie m")
    List<Movie> findAll();

    @Modifying
    @Query("delete from Movie m where m.id=?1")
    void deleteById(Long movieId);

}

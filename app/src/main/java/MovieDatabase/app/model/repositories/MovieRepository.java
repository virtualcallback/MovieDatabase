package MovieDatabase.app.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import MovieDatabase.app.model.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

package MovieDatabase.app.model.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MovieDatabase.app.model.entities.Movie;
import MovieDatabase.app.utils.MovieData;

public class MovieRepositoryInMemory {
	
	private Map<Long, Movie> movies;
	private Long idIndex;
	
	public MovieRepositoryInMemory() {
		movies = new HashMap<>();
		idIndex = MovieData.populate(movies);
	}
	
	/**
	 * find all movies
	 */
	public List<Movie> findAll() {
		return new ArrayList<>(movies.values());
	}
	
	/**
	 * update a movie
	 */
	public Movie saveAndFlush(Movie movie) {
		//save
		if(movie.getId() == null) {
			++idIndex;
			movie.setId(idIndex);
			movies.put(idIndex, movie);
		}		
		//update
		else {
			movies.put(movie.getId(), movie);
		}
		return movie;		
	}
	
	/**
	 * find a movie by id
	 */
	public Movie findOne(Long id) {
		return movies.get(id);
	}
	
	/**
	 * delete a movie
	 */
	public Movie delete(Movie movie) {
		return movies.remove(movie.getId());
	}

}

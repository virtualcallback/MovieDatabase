package MovieDatabase.app.utils;

import java.util.Map;

import MovieDatabase.app.model.entities.Movie;

public class MovieData {
	
	public static Long populate (Map<Long, Movie> movies) {
		Movie m1 = new Movie(
				1L, 
                "The Dark Knight", 
                "Joker wreaks havoc and chaos on the people of Gotham", 
                "Christopher Nolan", 
                2008, 
                "Christian Bale", 
                "Action",
                "http://ia.media-imdb.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg"
				);
		movies.put(1L, m1);
		Movie m2 = new Movie(
				2L, 
                "Fight Club", 
                "An insomniac office worker, looking for a way to change his life", 
                "David Fincher", 
                1999, 
                "Brad Pitt", 
                "Drama",
                "http://ia.media-imdb.com/images/M/MV5BNGM2NjQxZTAtMmU5My00YTk5LWFmOWMtYjZlYzk4YzMwNjFlXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SY1000_CR0,0,666,1000_AL_.jpg"
				);
		movies.put(2L, m2);
		Movie m3 = new Movie(
				3L, 
                "Inception", 
                "A thief, is given the inverse task", 
                "Christopher Nolan", 
                2010, 
                "Leonardo DiCaprio", 
                "Action",
                "http://ia.media-imdb.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg"
				);
		movies.put(3L, m3);
		return 3L;
	}

}

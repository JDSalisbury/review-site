package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MovieRepo {
		
	protected Map<Long, Movie> reviews = new HashMap<>();
	
	public MovieRepo() {
//		Movie movie1 = new Movie(123L, "Hook", null, null, null);
//		Movie movie2 = new Movie(223L, "Jumanji", null, null, null);
//		Movie movie3 = new Movie(323L, "Jack", null, null, null);
//		Movie movie4 = new Movie(423L, "Bicentenial Man", null, null, null);
//		
		
	}
	
	public MovieRepo(Movie... reviews) {
		populateMovieMap(reviews);
	}
	
	
	public void populateMovieMap(Movie... reviews) {
		for (Movie movie : reviews) {
			this.reviews.put(movie.getId(), movie);
		}
	}
	

	public Movie findOne(long id) {
		return reviews.get(id);
	}

	public Collection<Movie> findAll() {
		return reviews.values();
	}
	
}

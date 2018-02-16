package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class MovieRepo {
		
	protected Map<Long, Movie> reviews = new HashMap<>();
	
	public MovieRepo() {
		Movie movie1 = new Movie(123L, "Hook", "something", "Something", "Something");
		Movie movie2 = new Movie(223L, "Jumanji", "Something", "Something", "Something");
		Movie movie3 = new Movie(323L, "Jack", "Something", "Something", "Somehting");
		Movie movie4 = new Movie(423L, "Bicentenial Man", "Something", "Something", "Something");
		
		
		populateMovieMap(movie1, movie2, movie3, movie4);
		
	}
	
	public MovieRepo(Movie... reviews) {
		populateMovieMap(reviews);
	}
	
	
	public void populateMovieMap(Movie... reviews) {
		for (Movie movie : reviews) {
			this.reviews.put(movie.getId(), movie);
		}
	}
	

	public Movie findOne(Long id) {
		return reviews.get(id);
	}

	public Collection<Movie> findAll() {
		return reviews.values();
	}
	
}

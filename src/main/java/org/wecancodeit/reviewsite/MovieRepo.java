package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepo {

	protected Map<Long, Movie> reviews = new HashMap<>();

	public MovieRepo() {
		Movie movie1 = new Movie(123L, "Hook", "/images/hook.jpg", "Comedy", "Decent Peter Pan Movie");
		Movie movie2 = new Movie(223L, "Jumanji", "/images/jumanji.jpg", "Comedy", "Is now the \"original\" one");
		Movie movie3 = new Movie(323L, "Jack", "/images/jack.jpg", "Comedy", "Could have been better");
		Movie movie4 = new Movie(423L, "Bicentenial Man", "/images/bicentennialMan.jpg", "Dramedy",
				"Too long didnt finish.");

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

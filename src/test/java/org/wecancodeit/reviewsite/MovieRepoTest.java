package org.wecancodeit.reviewsite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class MovieRepoTest {

	private MovieRepo underTest;

	private long firstMovieId = 23L;
	private Movie firstMovie = new Movie(firstMovieId, "first movie", "description of first course", null, null);

	private long secondMovieId = 86L;
	private Movie secondMovie = new Movie(secondMovieId, "second movie", "description of second course", null, null);

	@Test
	public void shouldFindFirstMovie() {
		underTest = new MovieRepo(firstMovie);

		Movie result = underTest.findOne(firstMovieId);

		assertThat(result, is(firstMovie));

	}

	@Test
	public void shouldFindSecondMovie() {

		underTest = new MovieRepo(firstMovie, secondMovie);

		Movie result = underTest.findOne(secondMovieId);

		assertThat(result, is(secondMovie));
	}

	@Test
	public void shouldFindAll() {
		underTest = new MovieRepo(firstMovie, secondMovie);

		Collection<Movie> result = underTest.findAll();

		assertThat(result, containsInAnyOrder(firstMovie, secondMovie));
	}
}

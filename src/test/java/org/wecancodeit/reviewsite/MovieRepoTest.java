package org.wecancodeit.reviewsite;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MovieRepoTest {

	private MovieRepo underTest;
	
	
	@Mock
	private Movie firstMovie;
	
	private long firstMovieId = 123L;
	
	
	@Mock
	private Movie secondMovie;
	
	private long secondMovieId = 223L;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		when(firstMovie.getId()).thenReturn(firstMovieId);
		when(secondMovie.getId()).thenReturn(secondMovieId);
	}
	
	@Test
	public void shouldFindFirstMovie() {
		underTest = new MovieRepo();
		
		Movie result = underTest.findOne(firstMovieId);
		assertThat(result, is(firstMovie));
	}
	
}

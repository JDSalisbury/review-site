package org.wecancodeit.reviewsite;

import java.util.HashMap;
import java.util.Map;

public class MovieRepo {
		
	protected Map<Long, Movie> reviews = new HashMap<>();
	
	public MovieRepo() {
//		Movie movie1 = new Movie(123L, "Hook", null, null);
//		Movie movie2 = new Movie(223L, "Jumanji", null, null);
//		Movie movie3 = new Movie(323L, "Jack", null, null);
//		Movie movie4 = new Movie(423L, "Bicentenial Man", null, null);
//		
		
	}

	public Movie findOne(long id) {
		return reviews.get(id);
	}
	
}

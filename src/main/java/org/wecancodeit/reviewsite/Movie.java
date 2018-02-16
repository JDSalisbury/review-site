package org.wecancodeit.reviewsite;

public class Movie {

	private long id;
	private String title;
	private String category;
	private String content;
	private String image;

	public Movie(long id, String title, String image, String category, String content)	{
		this.id = id;
		this.title = title;
		this.category = category;
		this.content = content;
		this.image = image;
	}
	
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getImage() {
		return image;
	}
	
}

package MovieDatabase.app.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String description;
	String director;
	Integer release_date;
	String leading_actor;
	String genre;
	String image_url;
	
	public Movie() {}

	public Movie(Long id, String name, String description, String director, Integer release_date, String leading_actor,
			String genre, String image_url) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.director = director;
		this.release_date = release_date;
		this.leading_actor = leading_actor;
		this.genre = genre;
		this.image_url = image_url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Integer release_date) {
		this.release_date = release_date;
	}

	public String getLeading_actor() {
		return leading_actor;
	}

	public void setLeading_actor(String leading_actor) {
		this.leading_actor = leading_actor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	
}

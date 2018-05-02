package actor;

import java.util.ArrayList;
import movie.Movie;

public class Actor {
	static String name;
	static ArrayList<Movie> movies;

	public Actor() {
		String name = null;
		ArrayList<Movie> movies = new ArrayList<Movie>(); 
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Actor.name = name;
	}

	public static ArrayList<Movie> getMovies() {
		return movies;
	}

	public static void setMovies(ArrayList<Movie> movies) {
		Actor.movies = movies;
	}

}

/***
 This class will have the following instance variables:
String name – the full name of the actor or actress.
ArrayList<Movie> movies – an Arraylist that has movies that this actor has acted in.
Add getters and setters for these instance variables.

Make sure to create a constructor that initializes your variables appropriately.
 * */

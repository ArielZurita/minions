package movie;
import java.util.ArrayList;

import actor.Actor;

public class Movie {
	static String name;
	static ArrayList<Actor> actors;
	static double rating;
	
	public Movie() {
		String name = null;
		ArrayList<Actor> actors = new ArrayList<Actor>();
		double rating = 0.0;
	}

	public static double getRating() {
		return rating;
	}

	public static void setRating(double rating) {
		Movie.rating = rating;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Movie.name = name;
	}

	public static ArrayList<Actor> getActors() {
		return actors;
	}

	public static void setActors(ArrayList<Actor> actors) {
		Movie.actors = actors;
	}
}

/**
This class will have the following instance variables:
String name – the name of the movie
ArrayList<Actor> actors – an ArrayList of the actors in the movie. 
double rating – a freshness rating from rotten tomatoes (www.rottentomatoes.com)
Add getters and setters for these instance variables.

Make sure to create a constructor that initializes your variables appropriately.
 */

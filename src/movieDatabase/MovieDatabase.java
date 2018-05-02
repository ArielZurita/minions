package movieDatabase;

import java.util.ArrayList;

import actor.Actor;
import movie.Movie;

public class MovieDatabase {
	static ArrayList<Movie> movieList;
	static ArrayList<Actor> actorList;

	public MovieDatabase() {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		ArrayList<Actor> actorList = new ArrayList<Actor>();
	}

	public static ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public static ArrayList<Actor> getActorList() {
		return actorList;
	}

}

/**
MovieDatabase 
This class has two instance variables:
ArrayList<Movie> movieList – an ArrayList of movies
ArrayList<Actor> actorList – an ArrayList of actors

Note: Make sure to add getters for both these instance variables. That is, add a getMovieList() and a getActorList() method.
*/
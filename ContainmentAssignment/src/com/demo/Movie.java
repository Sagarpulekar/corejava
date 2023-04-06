package com.demo;

public class Movie {
	private int movieId;
	private String movieName;
	private int yearOfRelease;
	static int Moviecount = 0;
	{
		Moviecount++;
	}

	public Movie() {
	}

	public Movie(int movieId, String movieName, int yearOfRelease) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.yearOfRelease = yearOfRelease;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "MovieId=" + movieId + " MovieName=" + movieName + " ReleaseYear=" + yearOfRelease;
	}

}

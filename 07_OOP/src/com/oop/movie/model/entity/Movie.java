package com.oop.movie.model.entity;

import java.util.Arrays;
import java.util.Calendar;

public class Movie {

	private String movieTitle;
	private String director;
	private String[] casting;
	private Calendar release;
	//private String casting_name = "";
	
	
	public Movie() {
		//기본생성자
	}
	public Movie(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public Movie(String movieTitle, String director) {
		this(movieTitle);
		this.director = director;
	}
	public Movie(String movieTitle, String director, String[] casting) {
		this(movieTitle,director);
		this.casting = casting;
	
	}	
	public Movie(String movieTitle, String director, String[] casting, Calendar release) {
		this(movieTitle,director,casting);
		this.release = release;
	}
	
	
	public String information() {
//		for(int i = 0; i < casting.length; i++) {
//			casting_name += casting[i];
//		}
		//String year = Integer.toString(release.get(Calendar.YEAR));
		//String month = Integer.toString(release.get(Calendar.MONTH)+1);
		//String day = Integer.toString(release.get(Calendar.DAY_OF_MONTH));
		String result = movieTitle + ", " + director + ", " + Arrays.toString(casting) + ", ";
		
		//NullPointerExcepton 에러 방지
		if(release != null)
			result += release.get(Calendar.YEAR) + "-" + (release.get(Calendar.MONTH)+1) + "-" + release.get(Calendar.DAY_OF_MONTH);
		else
			result += null;
		
		return result;
	}
	
	
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getCasting() {
		return casting;
	}
	public void setCasting(String[] casting) {
		this.casting = casting;
	}
	public Calendar getRelease() {
		return release;
	}
	public void setRelease(Calendar release) {
		this.release = release;
	}
	
	
	
	
}

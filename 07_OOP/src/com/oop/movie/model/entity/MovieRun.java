package com.oop.movie.model.entity;

import java.util.Calendar;

public class MovieRun {

	public static void main(String[] args) {
		
		Movie m = new Movie("괴물");
		System.out.println(m.information());
		
		Movie m2 = new Movie("살인의추억","봉준호");
		System.out.println(m2.information());
		
		String[] str1 = {"디카프리오 ","켄 ","고든레빗 ","엘렌페이지"};
		Movie m3 = new Movie("인셉션","놀란",str1);
		System.out.println(m3.information());
		
		String[] str2 = {"로버트다우니주니어 ","크리스에반스 ","햄스워스 ","마크러팔로 ","스칼렛요한슨 "};
		Calendar cal = Calendar.getInstance();
		//개봉날짜 지정(2021-05-13)
		//cal.set(Calendar.YEAR, 2021);
		//cal.set(Calendar.MONTH, 4);
		//cal.set(Calendar.DAY_OF_MONTH, 13);
		cal.set(2021, Calendar.DECEMBER, 13);
		Movie m4 = new Movie("어벤져스","루소형제",str2,cal);
		System.out.println(m4.information());
		
	}

}

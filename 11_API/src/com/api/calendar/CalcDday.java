package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * [문제2] 
 * 패키지 com.api.calendar.CalcDday.java
 * Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
 * 사용자로 부터 D-day를 입력받고, 다음과 같이 출력하세요.
 * 
 * ->  193일 남았습니다. (D-DAY 전)
 * ->  D-DAY입니다.(D-DAY)	
 * ->  20일 지났습니다.(D-DAY가 지난 경우)
 * 
 */

public class CalcDday {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		CalcDday c = new CalcDday();
		//c.test1();
		c.test2();
	}
	
	public void test1() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2021, Calendar.JULY, 8);
		Calendar now = Calendar.getInstance();
		long num1 = now.getTimeInMillis();
		long num2 = cal.getTimeInMillis();
		long diff = (num2 - num1) / 1000 / 60 / 60 / 24;
		if(diff == 0)
			System.out.println("D-day입니다");
		else
			System.out.println("D - " + (diff + 1) + "일 입니다");
		
		System.out.println("------------------------");
	}
	
	public void test2() {
		System.out.print("년도 > ");
		int year = sc.nextInt();
		System.out.print("월 > ");
		int month = sc.nextInt();
		System.out.print("일 > ");
		int day = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		Calendar now = Calendar.getInstance();
		long num1 = now.getTimeInMillis();
		long num2 = cal.getTimeInMillis();
		long diff = (num2 - num1) / 1000 / 60 / 60 / 24;
		if(diff == 0)
			System.out.println("D-day입니다");
		else if(diff > 0)
			System.out.println((diff + 1) + "일 남았습니다");
		else
			System.out.println((-diff + 1) + "일 지났습니다");
		
		
		
	/*	
	 * 강사님 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("D-Day를 입력하세요.\n년도(yyyy) : ");
		int yyyy = sc.nextInt();
		System.out.print("월 : ");
		int mm = sc.nextInt();
		System.out.print("일 : ");
		int dd = sc.nextInt();
		
		Calendar today = Calendar.getInstance();
		
		Calendar dday = Calendar.getInstance();
		//dday.set(yyyy, mm, dd);
		dday.set(yyyy, mm-1, dd, 0, 0, 0);
		dday.set(Calendar.MILLISECOND, 0);
		
		
		//날짜차이 계산
		//정확하게 하기위해서는 double로 받아야한다
		double diff = (dday.getTimeInMillis()-today.getTimeInMillis());
		System.out.println(diff);
		
		diff = diff / (1000*60*60*24);
		System.out.println(diff);
				
		
		if(diff > 0)
			System.out.println((int)diff + 1 + "일 남았습니다.");
		else if(diff > -1)
			System.out.println("D-Day입니다");
		else 
			System.out.println(-(int)diff + "일 지났습니다.");
	*/	
		
	}
}

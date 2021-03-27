package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String[] dayOfWeek = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};		
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",year,month,day,
							dayOfWeek[cal.get(Calendar.DAY_OF_WEEK)-1],hour,minute,second);
		
	}

}

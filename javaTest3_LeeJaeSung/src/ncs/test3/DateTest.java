package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {

		Calendar cal1 = new GregorianCalendar(1987, Calendar.MAY, 27);
		
		Calendar cal2 = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일'");
		String[] dayOfWeek = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		System.out.println("생일 : " + sdf.format(cal1.getTime()) + dayOfWeek[cal1.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("현재 : " + sdf.format(cal2.getTime()));
		long num1 = cal2.getTimeInMillis();
		long num2 = cal1.getTimeInMillis();
		long diff = (num1 - num2)/ 1000 / 60 / 60 / 24 / 365;
		System.out.println("나이 : " + diff + "세");
	}

}

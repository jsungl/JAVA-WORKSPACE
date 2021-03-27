package kh.java.api.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 날짜 : java.text.SimpleDateFormat
 * 숫자 : java.text.DecimalFormat
 *
 */






public class StringFormatTest {

	public static void main(String[] args) {

		StringFormatTest s = new StringFormatTest();
		s.test1();
		//s.test2();
	}
	
	//SimpleDateFormat
	public void test1() {
		
		Date d = new Date();
	//	Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm:ss");
		String result = sdf.format(d);
		//System.out.println(result);
	}
	
	
	
	/*
	 * DecimalFormat(3자리마다 ,찍기, 자리수조정)
	 * 
	 * # 해당자리에 데이터가 없는경우, 생략
	 * 0 해당자리에 데이터가 없는경우, 0으로 표시
	 * 
	 */
	public void test2() {
		
		double num = 1234567890.12345; //소수점이하는 날라간다
		DecimalFormat df = new DecimalFormat("#,###"); //3자리마다 ,찍기
		System.out.println(df.format(num)); //1,234,567,890
		
		df.applyPattern("#.###"); //소수점 이하 자리를 표현한다
		System.out.println(df.format(num)); //1234567890.123
		
		double num2 = 1234567890.123;
		df.applyPattern("#.00000");
		System.out.println(df.format(num2)); //1234567890.12300
	}

}

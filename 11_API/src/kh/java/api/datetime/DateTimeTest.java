package kh.java.api.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * java.util.Calendar
 * java.util.Date 기본생성자,long타입 생성자를 제외하고 사용금지 (deprecated)
 * java.time.LocalDateTime 최근에 추가됨, Calendar의 불편함을 개선
 * 
 */
public class DateTimeTest {

	public static void main(String[] args) {

		DateTimeTest d = new DateTimeTest();
		//d.test1();
		//d.test2();
		d.test3();
	}

	
	public void test1() {
		//현재 날짜,시각 정보
		Calendar c1 = Calendar.getInstance(); //Calendar가 추상클래스이기때문에 new연산자를 사용할 수 없다(객체화할수없다)
		Calendar c2 = new GregorianCalendar(); //Calendar를 상속받는다
		
		//조회
		System.out.println(c1.get(Calendar.YEAR)); //년도
		System.out.println(c1.get(Calendar.MONTH) + 1); //월
		System.out.println(c1.get(Calendar.DATE)); //일
		System.out.println(c1.get(Calendar.HOUR)); //12시간제
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //24시간제
		System.out.println(c1.get(Calendar.MINUTE)); //분
		System.out.println(c1.get(Calendar.SECOND)); //초
		
		
		//요일(일1, 월2, 화3, 수4, 목5, 금6, 토7)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //숫자로 반환
		char[] dayOfWeek = {'일','월','화','수','목','금','토'};
		System.out.println(dayOfWeek[c1.get(Calendar.DAY_OF_WEEK)-1]); //배열사용
		
		printCalendar(c1);
	}
	
	/*
	 * yyyy/MM/dd hh:mm:ss
	 * 
	 */
	public void printCalendar(Calendar c) {
		
		System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",c.get(Calendar.YEAR),c.get(Calendar.MONTH) + 1,c.get(Calendar.DATE),
												c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
	}
	
	
	
	/*
	 * 특정일 특정시각을 Calendar객체로 생성
	 */
	public void test2() {
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2021, Calendar.JANUARY, 1, 0, 0, 0); //2021/1/1
		printCalendar(c1);
		
		Calendar c2 = new GregorianCalendar(2021,Calendar.MARCH,2,15,20,33); //생성자를 이용해서 세팅
		printCalendar(c2);
		
		//날짜 차이 계산하기
		Calendar now = Calendar.getInstance();
		//밀리초 단위로 변환해서 차이를 구한후 다시 초분시일 단위로 환산
		long num1 = now.getTimeInMillis();
		long num2 = c1.getTimeInMillis();
		//millis / 1000(초) / 60(분) / 60(시) / 24(일)
		long diff = (num2 - num1) / 1000 / 60 / 60 / 24;
		
		//System.out.println(diff);
		//System.out.println("새해까지 D-" + (diff+1) + "일 남았습니다");
	}
	
	
	/*
	 * Date()
	 * Date(long millis)
	 * 위 두 생성자만 사용가능하다
	 */
	public void test3() {
		
		Date now = new Date();
		System.out.println(now);
		
		//to Calendar (Calendar에게 넘기기)
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		System.out.println(cal);
		
		//to Date
		long millis = cal.getTimeInMillis();
		Date date = new Date(millis);
		System.out.println(date);
	}
}

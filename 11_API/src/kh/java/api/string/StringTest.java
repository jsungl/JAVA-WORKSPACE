package kh.java.api.string;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {

		StringTest st = new StringTest();
		//st.test1();
		st.test2();
		//st.test3();
	}
	
	//String은 immutable(변경불가)이다
	public void test1() {
		
		String s1 = "java";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 += "oracle"; //직접적 수정이 아니라 새로 javaoracle을 하나 만든다 -> hashcode가 다름 -> String은 변경불가
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}
	
	
	/*
	 * StringBuilder는 mutable(변경가능)이다 - 싱글쓰레드용
	 * StringBuffer는 mutable(변경가능)이다 - 멀티쓰레드용,동기화를 지원
	 */
	public void test2() {
		StringBuilder sb = new StringBuilder("java");
		StringBuffer sb2 = new StringBuffer("java");
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
		sb.append("oracle");
		sb2.append("oracle");
		System.out.println(sb.hashCode()); //hashcode가 같다
		System.out.println(sb2.hashCode()); //hashcode가 같다
		
//		print(sb.toString()); //StringBuilder안에 있는 내용물을 꺼내서 보내야한다
		System.out.println(sb);
		System.out.println(sb2);
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	
	/*
	 * csv데이터 처리하기
	 * "java, oracle, html, javascript, css"
	 * 
	 * 구분자는 실제 데이터에 사용되지않는 어떠한 문자도 좋다
	 * java/oracle/html/spring/maven
	 * 
	 * 1.String의 split
	 * 2.StringTokenizer
	 * 
	 */
	public void test3() {
		
		String data = "java/oracle/html/spring/maven"; //csv데이터
		
		//1.split
		String[] arr = data.split("/");
		for(String s : arr) {
			System.out.println("[" + s + "]");
		}
		
		//2.StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(data,"/");
		while(tokenizer.hasMoreTokens()) { //token이 남아있다면 true
			System.out.println(tokenizer.countTokens()); //몇개남았는지 count
			String s = tokenizer.nextToken(); //다음 token을 받아서 저장
			System.out.println("<" + s + ">");
		}
//		String s = tokenizer.nextToken(); //1번만 호출해야된다
		
		
		//구분자 처리 다른점
		//1. StringTokenizer는 빈문자열은 요소로 취급하지않는다
		//2. StringTokenizer는 구분문자열을 문자단위로 인식처리
		//3. split도 정규표현식을 사용하면 문자단위로 처리
		
		data = "a,,b,,c,d";
//		data = "a, b,c, d";
		arr = data.split(",");
//		arr = data.split(", ");
//		arr = data.split("[, ]"); //정규표현식 : ,와 공백을 구분자로 처리		
		for(String s : arr) {
			System.out.println("[" + s + "]"); //빈문자(공백)도 하나의 값으로 처리된다
		}
	
		StringTokenizer tokenizer2 = new StringTokenizer(data,",");
//		StringTokenizer tokenizer2 = new StringTokenizer(data,", ");
		while(tokenizer2.hasMoreTokens()) {
			System.out.println("<" + tokenizer2.nextToken() + ">"); //빈문자(공백)를 제외하고 처리된다
		}
		
		
	}

}

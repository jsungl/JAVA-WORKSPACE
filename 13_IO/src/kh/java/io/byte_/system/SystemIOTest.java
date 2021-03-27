package kh.java.io.byte_.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * byte 기반의 표준입출력
 * System.in : 사용자 키보드 입력
 * System.out : 콘솔화면
 * 
 *
 */

public class SystemIOTest { 

	public static void main(String[] args) {

		SystemIOTest s = new SystemIOTest();
		//s.test1();
		s.test2();
	}

	
	/*
	 * System.in
	 * 
	 * read() : int -> 대상으로부터 1byte 읽어와서 int로 리턴
	 * 256가지(0~255) + 1(-1 : 읽어올 값이 없는 경우)
	 * 
	 */
	public void test1() {
		System.out.print("키보드로 입력값을 주세요 : ");
		int data = 0; //읽어온 값을 처리할 변수
		
		try {
			while((data = System.in.read()) != -1) {
				System.out.println("input = " + data); //13: \r , 10 : \n
				//이클립스에서 ctrl+z 입력하면 -1을 리턴(종료신호)
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * JDk 1.5 버젼이 나오기전
	 * Scanner클래스가 등장전의 사용자 입력처리는 다음과 같다
	 */
	
	public void test2() {
		//보조스트림 : 기본스트림에 연결해서 사용. 보조스트림 여러개를 연결할수있다
		//마지막 연결된 보조스트림으로 입출력 제어 및 자원 반납을 한다
		//System.in -> 브릿지 스트림 -> 보조스트림
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//문자기반의 BufferedReader와 바이트기반의 System.in을 연결해서 사용하려면 bridge스트림인 InputStreamReader을 연결해서 사용한다 
		
		String data = "";
		
		System.out.println("키보드로 입력하세요 : ");
		try {
//			int sum = 0;
			while((data = br.readLine()) != null) { //엔터쳤을때만 while문이 돌아간다
				System.out.println(data);
//				sum += data; //사용자가 입력한값은 모두 문자이기때문에 안된다
//				sum += Integer.parseInt(data) //이렇게 바꿔야한다
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//finally절에서 자원반납
			//표준입출력(System.in)을 사용하는 스트림클래스는 반납하면 안된다 -> 한번닫힌 표준입출력은 프로그램종료까지 재사용불가한데
			//													BufferedReader을 닫으면 연쇄적으로 다 닫히기때문에 
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
	
	
	
	
	
	
	
}

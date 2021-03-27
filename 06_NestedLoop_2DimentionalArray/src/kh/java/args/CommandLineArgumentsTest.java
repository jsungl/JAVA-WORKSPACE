package kh.java.args;

/**
 * 프로그램 시작과 동시에 사용자 입력값 받아 처리 가능하다
 * 사용자 입력값을 " " 을 구분자로 끊어서 String[]로 만들어 main메소드에 전달
 * abc def 123 ---> {"abc","def","123"}
 * 
 * 
 *
 */



public class CommandLineArgumentsTest {

	public static void main(String[] args) {
		
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]); //run configurations - arguments에서 설정
//		}
		
		CommandLineArgumentsTest c = new CommandLineArgumentsTest();
		//c.test1(args); //test1에 인자로 전달
		//c.test2(1);
		//c.test2(1,2);
		//c.test2(1,2,3);
		c.test2("안녕",1,2,3,4);
		
		
		
		System.out.println("프로그램 종료");

	}
	
	public void test1(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]); //문자열을 int로 형변환해야한다
		}
		System.out.println(sum); //공백을 구분자로
	}
	
	//가변인자
	//타입이 동일하고 개수가 정해지지않은 매개인자를 처리할수있다
	//개수제한없이 쓰고싶을떄 사용
	//가변인자는 매개변수 선언부에서 마지막에 작성해야한다
	public void test2(String s,int... arr) { //개수제한 없이 처리하는 매개변수
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println(s);
		System.out.println(sum);
	}

}

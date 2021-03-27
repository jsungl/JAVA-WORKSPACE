package kh.java.test.array;

/**
 * 길이가 5인 String 배열을 선언하고, 
    “딸기”, ”복숭아”, ”키위”, ”사과” , ”바나나” 로 초기화를 한 후, 
    배열 인덱스를 활용해서 바나나를 출력해 보세요
 * 
 * 
 *
 */
public class Test2 {

	public static void main(String[] args) {

		new Test2().test();
	}
	
	public void test() {
		String[] stArr = new String[5];
		stArr[0] = "딸기";
		stArr[1] = "복숭아";
		stArr[2] = "키위";
		stArr[3] = "사과";
		stArr[4] = "바나나";
		System.out.println(stArr[4]);
		
	}

}

package test.controller;

//2단에서 5단까지의 구구단의 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다.
public class Test2 {

	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 5; dan++) {
			for(int i = 1; i < 10; i++) {
				if((dan*i) % 2 != 0) //결과값중 홀수
					System.out.println(dan + "*" + i + "=" + dan*i);		
			}
		}
		
	
		
	}

}

package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) throws InvalidException{
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("2부터 5까지의 정수형 데이터를 입력 : ");
			int num = sc.nextInt();
			if(!(num >=2 && num <= 5)) {
				throw new InvalidException("입력 값에 오류가 있습니다.");
			}
			
			double result = new Calculator().getSum(num);
			System.out.println("결과값 : " + result);
		}
		
	}

}

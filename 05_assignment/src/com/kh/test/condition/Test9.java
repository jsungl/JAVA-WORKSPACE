package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Test9 t = new Test9();
		t.test();
	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		String main_menu = "*********주메뉴*********\n"
				+ "a. 불고기버거 ------------5000\n"
				+ "b. 새우버거 --------------4000\n"
				+ "c. 치킨버거 --------------4500\n"
				+ "d. 한우버거 -------------10000\n"
				+ "e. 디버거 ----------------7000\n"
				+ "***********************";
		
		String side_menu = "*******사이드메뉴********\n"
				+ "1. 콜라 -------------------1500\n"
				+ "2. 사이다 -----------------1500\n"
				+ "3. 밀크쉐이크-------------2500\n"
				+ "4. 레드불------------------3000\n"
				+ "***********************";
		
		System.out.println(main_menu);
		System.out.print("주메뉴를 선택하세요 : ");
		char m = sc.next().charAt(0);
		int main_price = 0;
		String main_name;
		
		switch(m) {
			case 'a' : main_price = 5000;main_name = "불고기버거";break;
			case 'b' : main_price = 4000;main_name = "새우버거";break;
			case 'c' : main_price = 4500;main_name = "치킨버거";break;
			case 'd' : main_price = 10000;main_name = "한우버거";break;
			case 'e' : main_price = 7000;main_name = "디버거";break;
			default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");return;
	}
		
		System.out.println(side_menu);
		System.out.print("사이드메뉴를 선택하세요 : ");
		int s = sc.nextInt();
		int side_price = 0;
		String side_name;
		
		switch(s) {
			case 1 : side_price = 1500;side_name = "콜라";break;
			case 2 : side_price = 1500;side_name = "사이다";break;
			case 3 : side_price = 2500;side_name = "밀크쉐이크";break;
			case 4 : side_price = 3000;side_name = "레드불";break;
			default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");return;
	}
		
		int tot = main_price + side_price;
		
		System.out.println(main_name + ", " + side_name + "은 총 " + tot + "원입니다");
		
		
		
		
	}

}

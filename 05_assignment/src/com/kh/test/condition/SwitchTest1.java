package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {

		//SwitchTest1 st = new SwitchTest1();
		//st.test1();
		Scanner sc = new Scanner(System.in);
		
		String menu = "----------menu----------\n"
				+ "1. 가정용 (50원/liter)\n"
				+ "2. 상업용 (45원/liter)\n"
				+ "3. 공업용 (30원/liter)\n"
				+ "-------------------------";
		System.out.println(menu);
		System.out.print("메뉴번호를 선택하세요. ==> ");
		int num = sc.nextInt();
		
		if((num >= 1 && num <= 3) == false) {
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
			return;
		}

		System.out.print("물 사용량을 입력하세요. ==> ");
		int use = sc.nextInt();
		
		int use_p = 0; //사용요금
		double wp = 0;//수도세
		int tot = 0; //총사용요금
		String s1 = " ";
		String s2 = " ";
		
		switch(num) {
		case 1 :
			use_p = 50 * use;s1 = "가정용";s2 = "가정에서 사용하실 경우";break;
		case 2 :
			use_p = 45 * use;s1 = "상업용";s2 = "업소에서 사용하실 경우";break;
		case 3 :
			use_p = 30 * use;s1 = "공업용";s2 = "공장에서 사용하실 경우";break;
		}
		
		wp = Math.floor(use_p * 0.05);
		//wp = (int)use_p * 0.05; int로 형변환하면 자동으로 소수점이하가 없어진다, 정수부분은 그대로
		tot = use_p + (int)wp;
		
		
		System.out.println("\n----------<<수도세>>-----------\n" + "선택메뉴번호 : " + num + ". " + s1 + "(" + s2 
								+ ")를 선택하셨습니다.\n" + "사용요금 : " + use_p + "\n수도세 : " + (int)wp 
								+ "\n 총수도요금 :" + tot + "원");
	}

}

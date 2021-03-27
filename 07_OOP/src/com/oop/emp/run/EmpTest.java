package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp = null; //null로 초기화
		EmpTest et = new EmpTest();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			et.mainMenu();
			System.out.print("번호 선택 > ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				emp = new Employee();
				emp.empInput();break;
			case 2 :
				emp = null; //참조변수에 null대입 --> 삭제
				break;
			case 3 :
				if(emp == null) //프로그램 시작과 동시에 바로 출력하려고하면
					System.out.println(">>먼저 사원정보를 입력하세요.");
				else
					emp.empOutput();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			}
		}
		
		
	}
	
	public void mainMenu() {
		String menu = "******* 사원 정보 관리 프로그램 ************\n"
					+ "1. 새 사원 정보 입력 \n"
					+ "2. 사원 정보 삭제 \n"
					+ "3. 사원정보 출력 \n"
					+ "9. 끝내기\n"
					+ "********************************************";
		System.out.println(menu);
	}

}

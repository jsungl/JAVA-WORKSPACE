package com.exception.rnd;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberOk {
	
	public static Scanner sc = new Scanner(System.in);
	public static int rn = (int)(Math.random()*100)+1; 
	public static NumberOk no = new NumberOk();
	public static int cnt = 0;
	

	public static void main(String[] args) {
		NumberOk no = new NumberOk();
		
		while(true) {
			no.gameStart();
			
			System.out.print("계속 하시겠습니까?(y/n) ");
			char ch = sc.next().charAt(0);
			if(ch == 'y') {
				rn = (int)(Math.random()*100)+1;
				cnt = 0;
				continue;
			}else {
				System.out.println("프로그램 종료합니다");
				break;
			}
		}
	}
	
	public void gameStart() {

		while(true) {
			cnt++;
			try {
				int num = no.getNumber();
			
				int chk = no.checkNumber(num);
				if(chk == 0) {
					System.out.println("맞았습니다");
					System.out.println(cnt + "번 만에 맞았습니다");
					break;
				}else if(chk == 1) {
					System.out.println("입력한 숫자보다 작습니다");
					continue;
				}else {
					System.out.println("입력한 숫자보다 큽니다");
					continue;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				cnt = 0;
			}
			
		}
	}
	
	public int getNumber() throws Exception{
		
		int num = 0;
		
		while(true) {
			System.out.print("1~100사이의 정수를 입력 > ");
			num = sc.nextInt();
			if(num < 1 || num > 100) {
				throw new Exception("1~100사이의 정수가 아닙니다");
			}else
				break;
		}
		return num;
	}
	
	public int checkNumber(int num) {
		
		int check;
		if(num == rn) {
			check = 0;
		}else if(num < rn) {
			check = -1;
		}else
			check = 1;
		
		return check;
	}
}


/**
 * 강사님 코드
    public class NumberOK {
	Scanner sc = new Scanner(System.in);
	int rnd, cnt;
	
	public static void main(String[] args){
		
		new NumberOK().go();
		
		System.out.println("프로그램을 종료합니다.");
	}

	public void go() {
		getRandomNumber();
		
		while(true){
			
			cnt++;
			
			int userNum = getNumber();
			
			int result = checkNumber(userNum);
			
			if(result > 0)
				System.out.println("입력한 숫자보다 작습니다.");
			else if(result <0)
				System.out.println("입력한 숫자보다 큽니다.");
			else {
				System.out.print("맞았습니다(."+cnt+"번) \n\n 계속 하시겠습니까? (y/n) : ");
				String answer = sc.next();
				
				if(answer.toLowerCase().charAt(0)=='y'){
					getRandomNumber();
				}else
					break;
			}
				
		}
	}

	public void getRandomNumber() {
		rnd = new Random().nextInt(100)+1;
		
		cnt = 0;
	}

	public int checkNumber(int userNum) {
		int result;
		
		if(userNum-rnd>0) result = 1;		//입력숫자가 큰 경우	: 입력하신 숫자보다 작습니다.
		else if(userNum-rnd<0) result = -1;	//입력숫자가 작은 경우 : 입력하신 숫자보다 큽니다.
		else result = 0;					//정답.
		
		return result;
	}
	public int getNumber() {
		int num;
		
		while(true){

			try {
			
				System.out.print("정수 입력 : ");
				num = sc.nextInt();
				break;	//정상적인 수를 입력한경우, 반복문 종료!
				
			} catch (InputMismatchException e){ //정수를 입력하지않으면(nextInt()했는데 다른 자료형인경우) Exception오류
				
				System.out.println("정수를 입력하세요!");
				sc.next(); //버퍼비우기
				
			}
		}
		
		return num;
	}
	
}
 
 */






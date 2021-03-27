package kh.java.object.array.student.controller;

import java.util.Scanner;

import kh.java.object.array.student.model.vo.StudentVO;

public class StudentManager {
	
	private Scanner sc = new Scanner(System.in);
	public static final int MAX_LENGTH = 100;
	//StudentVO클래스를 필드변수로써 참조한다 ────> 연관관계 (has a 포함관계) 
	//StudentManager has a StudentVO
	private StudentVO[] arr = new StudentVO[MAX_LENGTH];
	private int index = 0; //사용자 입력값에 따라 처리될 인덱스 변수
	
	
	public void inputStudent() {
		
		while(index < MAX_LENGTH) {
			System.out.println("-----" + (index + 1) + "-----");
			System.out.print("학번 : ");
			int no = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			
			StudentVO stdt = new StudentVO(no,name,phone); //StudentVO객체 생성
			arr[index++] = stdt; //배열추가
			//arr[index++] = new StudentVO(no,name,phone);
			/* index의 의미
			*다음에 추가할 요소의 인덱스
			*현재까지 입력한 요소의 개수
			*/
			
			System.out.println("계속입력하시겠습니까? (y/n)");
			char yn = sc.next().charAt(0);
			if(yn == 'n') {
				System.out.println("=====입력완료=====");
				break;
			}
			
		}
	}
	
	public void printStudent() {
		//2.index변수를 이용해서 입력한 개수만큼 접근(null체크 필요없음)
		for(int i = 0; i < index; i++) {
			StudentVO s = arr[i];
			System.out.printf("%-15s%-15s%-15s%n",s.getNo(),s.getName(),s.getPhone()); //좌측정렬
		}
		

		
		
		
		//1.MAX_LENGTH 100개 공간 모두 접근(null체크 필요)		
//		for(StudentVO s : arr) {
//			if(s == null)
//				break;
//			System.out.printf("%-15s%-15s%-15s%n",s.getNo(),s.getName(),s.getPhone()); //좌측정렬
//		}
			
	}

}

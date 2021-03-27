package compony;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월급(기본급) 입력 : ");
		int salary = sc.nextInt();
		Compony c = new Compony(salary);
		System.out.println("연 기본급 합 : " + c.getAnnualIncome() + " 세후 : " + c.getAfterTaxIncome());
		System.out.println("연 보너스 합 : " + c.getBonus() + " 세후 : " + c.getAfterTaxBonus());
		System.out.println("연 지급액 합 : " + (c.getAfterTaxIncome() + c.getAfterTaxBonus()));
	}

}

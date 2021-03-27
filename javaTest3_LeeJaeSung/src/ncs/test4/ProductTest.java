package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("개수 : ");
		int quantity = sc.nextInt();
		Product p = new Product(name,price,quantity);
		System.out.println(p.information());
		
	}

}

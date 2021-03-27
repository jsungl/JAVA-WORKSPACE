package kh.java.inherit.product.run;

import kh.java.inherit.product.model.vo.Desktop;
import kh.java.inherit.product.model.vo.SmartPhone;
import kh.java.inherit.product.model.vo.TV;

public class ProductMain {

	public static void main(String[] args) {

		Desktop d = new Desktop("삼성","삼성s",1000000,"windows10","UHD커브드","기계식키보드");
		System.out.println(d.printDesktopInfo());
//		System.out.println(d); //d.toSting()안하는 이유 : 객체가 문자열로 표현되야할때(콘솔출력) 자동호출된다 
		
		SmartPhone s = new SmartPhone("애플","iphone12",500000,"ios14","SKT");
		System.out.println(s.printSmartPhoneInfo());
//		System.out.println(s);
		
		TV tv = new TV("LG","LG 롤러블 TV",100_000_000,100,30);
		System.out.println(tv.printTVInfo());
//		System.out.println(tv);
	}

}

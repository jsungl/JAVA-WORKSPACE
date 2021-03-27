package kh.java.oop.access.modifier.field;

public class KiwiRun {
	
	public static void main(String[] args) {
	
		Kiwi k = new Kiwi();
		System.out.println(k.publicNum);
		System.out.println(k.protectedNum);
		System.out.println(k.defaultNum);
		//System.out.println(k.privateNum); 접근불가
	}

}

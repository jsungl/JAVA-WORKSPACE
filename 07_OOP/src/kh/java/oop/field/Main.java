package kh.java.oop.field;

public class Main {
	
	public static void main(String[] args) {
		
		GalaxyNote ph1 = new GalaxyNote();
		ph1.setOwner("이재성");
		ph1.setPhoneNumber("01050048995");
		System.out.println(ph1.getOwner() + " : " + ph1.getPhoneNumber());
		//static 변수는 class명으로 접근해야한다
		System.out.println(GalaxyNote.WIDTH);
		//System.out.println(ph1.width = 15); fianl로 지정했으므로 변경불가
		
		
		GalaxyNote ph2 = new GalaxyNote();
		ph2.setOwner("홍길동");
		ph2.setPhoneNumber("01074442345");
		System.out.println(ph2.getOwner() + " : " + ph2.getPhoneNumber());
		System.out.println(ph2.HEIGHT);
		
		//jdk static 변수
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}

}

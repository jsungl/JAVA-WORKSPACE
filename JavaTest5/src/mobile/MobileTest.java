package mobile;

public class MobileTest {

	public static void main(String[] args) {

		Ltab lt = new Ltab("Ltab",500,"AP-01");
		Otab ot = new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("-----------------------------------");
		System.out.println(lt.getMobileName() + "\t" + lt.getBatterySize() + "\t" + lt.getOsType());
		System.out.println(ot.getMobileName() + "\t" + ot.getBatterySize() + "\t" + ot.getOsType());
		System.out.println();
		
		System.out.println("10분충전");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("-----------------------------------");
		System.out.println(lt.getMobileName() + "\t" + lt.charge(10) + "\t" + lt.getOsType());
		System.out.println(ot.getMobileName() + "\t" + ot.charge(10) + "\t" + ot.getOsType());
		System.out.println();
		
		System.out.println("5분통화");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("-----------------------------------");
		System.out.println(lt.getMobileName() + "\t" + lt.operate(5) + "\t" + lt.getOsType());
		System.out.println(ot.getMobileName() + "\t" + ot.operate(5) + "\t" + ot.getOsType());
	
		
	}

}

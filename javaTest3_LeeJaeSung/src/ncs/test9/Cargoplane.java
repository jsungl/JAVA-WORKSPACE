package ncs.test9;

public class Cargoplane extends Plane{

	public Cargoplane() {
		
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	//일정거리만큼 운행,연료감소. 10운항시 연료50감소
	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - distance*5);
	}
	
}

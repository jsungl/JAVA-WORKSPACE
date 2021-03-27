package ncs.test9;

public class Airplane extends Plane{

	public Airplane() {
			
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	//일정거리만큼 운항,연료 감소.  10운항시 연료 30감소
	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - distance*3);
	}
	
}

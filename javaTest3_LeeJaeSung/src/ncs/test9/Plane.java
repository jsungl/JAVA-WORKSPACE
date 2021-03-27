package ncs.test9;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	//일정 양의 연료주입, 기존연료가 증가됨
	public void refuel(int fuel) {
		fuelSize += fuel;
	}
	//일정거리만큼 운항, 연료감소됨. 추상메소드로 하위 객체에서 반드시 구현해야함
	public abstract void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
}

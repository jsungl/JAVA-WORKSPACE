package ncs.test10;

public class Sales extends Employee implements Bonus{

	public Sales() {
		
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	//salary에 13%적용
	@Override
	public double tax() {
		return super.getSalary() * 0.13;
	}
	
	//pay의 120%
	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay*1.2));
	}
}

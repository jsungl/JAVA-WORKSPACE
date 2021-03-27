package compony;

public class Compony {

	private double salary; //월급
	private double annualIncome; //연봉
	private double bonus; //보너스
	private double afterTaxIncome; //월급 세금
	private double afterTaxBonus; //보너스 세금
	
	public Compony() {
		
	}
	
	public Compony(double salary) {
		this.salary = salary;
	}


	public double getAnnualIncome() {
		return salary * 12;
	}


	public double getBonus() {
		return salary * 0.2 * 4;
	}


	public double getAfterTaxIncome() {
		return getAnnualIncome() - (getAnnualIncome() * 0.1);
	}


	public double getAfterTaxBonus() {
		return getBonus() - (getBonus() * 0.055);
	}
	
}

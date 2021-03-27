package ncs.test10;

public class Company {

	public static void main(String[] args) {

		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery",1,"secretary",800);
		employees[1] = new Sales("Clinten",2,"sales   ",1200);
		
		System.out.println("name\t department\t salary");
		System.out.println("---------------------------------");
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName() + "\t " + employees[i].getDepartment()
									+ "\t " + employees[i].getSalary());
		}
		
		System.out.println("\n인센티브 100 지급");
		for(Employee e : employees) {
			if(e instanceof Secretary)
				((Secretary) e).incentive(100);
			if(e instanceof Sales)
				((Sales) e).incentive(100);
		}
		
		
		System.out.println("name\t\tdepartment\t\tsalary\t\ttax");
		System.out.println("-------------------------------------");
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName()+"\t\t"+ 
							   employees[i].getDepartment()+"\t\t"+ 
							   employees[i].getSalary()+"\t\t"+
							   employees[i].tax());
		}
	}

}

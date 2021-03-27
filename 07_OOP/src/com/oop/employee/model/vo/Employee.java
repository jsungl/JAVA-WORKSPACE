package com.oop.employee.model.vo;

public class Employee {

	int empNo,salary;
	String name,phone,dept;
	char gender;
	double bonusPct;
	
	public Employee(){
		 
	}
	
	public  Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	public  Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonusPct) {
		this(empNo,name,gender,phone);
		this.dept = dept;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	public void printEmployee() {
		System.out.println(empNo + ", " + name + ", " + gender + ", " + phone + ", " + dept + ", " + salary + ", "
							+ bonusPct);
	}
}

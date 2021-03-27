package com.oop.employee.controller;

import com.oop.employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp2 = new Employee(1,"홍길동",'남',"010-7777-7777");
		Employee emp3 = new Employee(2,"유관순",'여',"010-3131-3131","영업부",3000000, 0.15);
		
		emp.printEmployee();
		emp2.printEmployee();
		emp3.printEmployee();
		
	}

}

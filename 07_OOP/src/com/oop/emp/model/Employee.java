package com.oop.emp.model;

import java.util.Scanner;

public class Employee {

	private String empName; //이름
	private String dept; //소속부서
	private String job; //직급
	private String phone; //핸드폰
	private String address; //주소
	private int empNo; //사번
	private int age; //나이
	private int salary; //급여
	private char gender; //성별
	private double bonusPoint; //보너스포인트
	
	
	
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 : ");empNo = sc.nextInt();sc.nextLine();
		System.out.print("이름 : ");empName = sc.nextLine();
		System.out.print("소속부서 : ");dept = sc.nextLine();
		System.out.print("직급 : ");job = sc.nextLine();
		System.out.print("나이 : ");age = sc.nextInt();
		System.out.print("성별(남/여) : ");gender = sc.next().charAt(0);
		System.out.print("급여(만원) : ");salary = sc.nextInt();
		System.out.print("보너스포인트(%) : ");bonusPoint = sc.nextDouble();sc.nextLine();
		System.out.print("핸드폰 : ");phone = sc.nextLine();
		System.out.print("주소 : ");address = sc.nextLine();
	}
	
	public void empOutput() {
		System.out.println("사번 : " + empNo);
		System.out.println("이름 : " + empName);
		System.out.println("소속부서 : " + dept);
		System.out.println("직급 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("급여 : " + salary);
		System.out.println("보너스포인트 : " + bonusPoint);
		System.out.println("핸드폰 : " + phone);
		System.out.println("주소 : " + address);		
	}
	//setter
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	//getter
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public int getEmpNo() {
		return empNo;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public char getGender() {
		return gender;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
}

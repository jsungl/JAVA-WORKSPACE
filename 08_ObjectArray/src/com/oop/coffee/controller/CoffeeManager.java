package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	
	private Coffee[] arr = new Coffee[3];
	private Scanner sc = new Scanner(System.in);
	
	public void inputCoffee() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("원산지 > ");
			String origin = sc.next();
			System.out.print("지역 > ");
			String location = sc.next();
			arr[i] = new Coffee(origin,location);
			//Coffee cf = new Coffee(origin,location);
			//arr[i] = cf;
			//Coffee c = arr[i];
		}
		
	}
	
	
	public void printCoffee() {
		String menu = "<세계3대커피>\n" 
				+ "---------------------------\n"
				+ "원산지\t\t지역\n"
				+ "---------------------------\n";
		System.out.println(menu);
		for(Coffee c : arr) {
			c.printCoffee();
		}
		System.out.println("---------------------------");
	}

}

package com.oop.body.model;

public class Leg extends Body{
	
	public Leg() {
		
	}
	
	public void run() {
		System.out.println("성큼성큼 뛰어갑니다");
	}

	@Override
	public void action_instance(Body body) {
		run();
	}
}

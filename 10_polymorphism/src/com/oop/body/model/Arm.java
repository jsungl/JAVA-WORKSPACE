package com.oop.body.model;

public class Arm extends Body{
	
	public Arm() {
		
	}
	
	public void armSwing() {
		System.out.println("팔을 뻗습니다.");
	}

	@Override
	public void action_instance(Body body) {
		armSwing();
	}
}

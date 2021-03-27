package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

import kh.java.polymorphism.animal.Animal;

public class ActionBody {

	public static void main(String[] args) {

		Body[] b = new Body[5];
		b[0] = new Head("빨강");
		b[1] = new Arm();
		b[2] = new Leg();
		b[3] = new Arm();
		b[4] = new Head("주황");
	
		//instanceof연산자 사용
//		ActionBody ab = new ActionBody();
//		for(int i = 0; i < b.length; i++) {
//			ab.action(b[i]);
//		}
		
//		//동적바인딩
		for(Body body : b)
			body.action_instance(body); 
			
		
	}
	
	public void action(Body body) {
		if(body instanceof Head)
			((Head)body).headBang();
		else if(body instanceof Arm)
			((Arm)body).armSwing();
		else if(body instanceof Leg)
			((Leg)body).run();
	}

}

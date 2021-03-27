package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {
	
	public static void main(String[] args) {
		
		Circle[] c = new Circle[3];
		c[0] = new Circle(20);
		c[1] = new Circle(30);
		c[2] = new Circle(40);
		
		RectAngle[] ra = new RectAngle[2];
		ra[0] = new RectAngle(20,20);
		ra[1] = new RectAngle(50,60);
		
		for(int i = 0; i < c.length; i++) {
			Circle cc = c[i];
			cc.draw();
		}
		
		
		for(int i = 0; i < ra.length; i++) {
			RectAngle rr = ra[i];
			rr.draw();
		}
			
		
		
		
		
	}

}

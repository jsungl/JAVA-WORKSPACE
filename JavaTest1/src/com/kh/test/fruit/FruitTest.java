package com.kh.test.fruit;

import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {

		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과","달콤"));
		list.add(new Fruit("오렌지","상큼"));
		list.add(new Fruit("키위","상큼"));
		
		System.out.println("값 삽입 : " + list);
		
		list.remove(1);
		System.out.println("값 삭제1 : " + list);
		
		list.remove(new Fruit("사과","달콤"));
		System.out.println("값 삭제2 : " + list);
	}

}

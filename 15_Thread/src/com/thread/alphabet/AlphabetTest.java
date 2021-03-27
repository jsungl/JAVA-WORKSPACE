package com.thread.alphabet;

import kh.java.thread.MultipleThread;

public class AlphabetTest {
	
	public static void main(String[] args) {
		AlphabetTest a = new AlphabetTest();
		a.test1();
		
	}
	
	public void test1() {
		
		
		Thread th1 = new Thread(new UpperAlphbetThread(500)); //0.5초마다 찍어라(millisecond:천분의일초)
		Thread th2 = new Thread(new LowerAlphbetThread(500)); //0.3초마다 찍어라
		
		th1.setName("대문자 쓰레드");
		th2.setName("소문자 쓰레드");
		
		th1.start();
		th2.start();
	}

}

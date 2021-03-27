package com.oop.method;

import java.util.Random;

public class Test {
	
	int a = 100; //멤버변수
    static int s = 99; //클래스변수
    
    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
        
        t.test2();
        
        Test t3 = new Test(); //Test클래스의 객체를 또 하나 만든순간 또 다른 한공간을 만든것과 같다
        t.test3(t3);
        System.out.println(t3.a);//10
       
        t.test4(t);
            
    }
    public void test1() {
        int a = 1000; //지역변수
        int s = 999;
        System.out.println(this.a); //100
        System.out.println(Test.s); //99
    }
    public void test2() {
        Test t = new Test();
        t.a = 1000;
        System.out.println(a);//100(=this.a)
    }
    public void test3(Test t) {
    	t.a = 10; //t3.a = 10
    	this.a = 200;
        System.out.println(t.a);//10        
    }
    public void test4(Test t) {
    	t.a = 1000;
        System.out.println(this.a);//1000
    }

}

package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	
	Scanner sc;
	
	public BookManager() {
		
	}
	
	public void fileSave() {
		
		File f = new File("object/books.dat");
		Book[] b = new Book[5];
		try(
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		){
			for(int i = 0; i < b.length; i++) {
				
				switch(i+1) {
				
				case 1 : 
					Calendar cal = Calendar.getInstance();
					cal.set(2020, Calendar.SEPTEMBER, 1);
					Book b1 = new Book("좋은 사람에게만 좋은 사람이면 돼","김재식",13000,cal,0.1);
					b[i] = b1;					
					break;
				case 2 :
					Calendar cal2 = Calendar.getInstance();
					cal2.set(2020, Calendar.DECEMBER, 1);
					Book b2 = new Book("공정하다는 착각","마이클 샌델",18000,cal2,0.2);
					b[i] = b2;					
					break;
				case 3 : 
					Calendar cal3 = Calendar.getInstance();
					cal3.set(2020, Calendar.JULY, 8);
					Book b3 = new Book("달러구트 꿈 백화점","이미예",13800,cal3,0.3);
					b[i] = b3;					
					break;
				case 4 :
					Calendar cal4 = Calendar.getInstance();
					cal4.set(2020, Calendar.OCTOBER, 13);
					Book b4 = new Book("트렌드 코리아 2021","김난도",18000,cal4,0.15);
					b[i] = b4;					
					break;
				case 5 : 
					Calendar cal5 = Calendar.getInstance();
					cal5.set(2020, Calendar.NOVEMBER, 23);
					Book b5 = new Book("광고의 8원칙","오두환",15000,cal5,0.25);
					b[i] = b5;
					break;
				
				}
				
			}
			
			oos.writeObject(b);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("books.dat 에 저장 완료!");
	}
	
	public void fileRead() {
		
		File f = new File("object/books.dat");
		Book[] bb = null;
		try(
				ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
			){
				bb = (Book[])ois.readObject();
				for(int i = 0; i < bb.length; i++) {
					if(bb[i] != null)
						System.out.println(bb[i]);
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			} 
		System.out.println("books.dat 읽기 완료!");
	}
	

}

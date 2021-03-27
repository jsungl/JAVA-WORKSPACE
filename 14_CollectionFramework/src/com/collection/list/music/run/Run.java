package com.collection.list.music.run;

import java.util.Scanner;

import com.collection.list.music.view.MusicMenu;

//실행클래스
public class Run {

	public static void main(String[] args) {

		MusicMenu m = new MusicMenu();
		m.mainMenu();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 6) {
			m.inputTitle();
			
		}
		
	}

}

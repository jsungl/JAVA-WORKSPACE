package com.io.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {

	private Scanner sc = new Scanner(System.in);
	
	public MyNote() {
		//기본생성자
	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder("");
		while(true) {
			System.out.print("파일에 저장할 내용을 입력하시오 : ");
			String str = sc.nextLine();
			if(str.equals("exit"))
				break;
			else 
				sb.append(str + "\n");
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		char chk = sc.next().charAt(0);
		sc.nextLine();
		if(chk == 'y' || chk == 'Y') {
			System.out.print("저장할 파일명 : ");
			String fileName = sc.nextLine();
			File f = new File("char/" + fileName + ".txt");
			BufferedWriter bw = null;
			try{
				bw = new BufferedWriter(new FileWriter(f));
				bw.write(sb.toString());
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}else
			return;
		
		
	}
	
	public void fileOpen() {
		
		System.out.print("열기할 파일명 : ");
		sc.nextLine();
		String openFileName = sc.nextLine();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("char/" + openFileName + ".txt"));
			String data = null;
			
			while((data = br.readLine()) != null) {
				System.out.println(data); //라인단위(개행문자전)로 읽어옴
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				System.out.println(openFileName + ".txt 파일을 열었습니다 ");
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				
		System.out.println("fileOpen() 종료");
	}
	
	public void fileAppend() {
		
		System.out.print("수정할 파일명 : ");
		String modifyFileName = sc.nextLine();
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb2 = new StringBuilder("");
		
		try {
			br = new BufferedReader(new FileReader("char/" + modifyFileName + ".txt"));
			String data = null;
			
			while((data = br.readLine()) != null) {
				System.out.println(data); //라인단위(개행문자전)로 읽어옴
			}
			
			while(true) {
				System.out.print("파일에 추가할 내용을 입력하시오 : ");
				String str = sc.nextLine();
				if(str.equals("exit"))
					break;
				else 
					sb2.append(str + "\n");
			}
			
			System.out.print("저장하시겠습니까? (y/n) : ");
			char chk = sc.next().charAt(0);
			if(chk == 'y' || chk == 'Y') {
				try{
					File f = new File("char/" + modifyFileName + ".txt");
					bw = new BufferedWriter(new FileWriter(f,true));
					bw.write(sb2.toString());
				
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						System.out.println(modifyFileName + ".txt 파일의 내용이 변경되었습니다.");
						bw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}else
				return;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				System.out.println("fileAppend() 종료1");
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("fileAppend() 종료2");
	}
	
	
	
}

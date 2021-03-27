package kh.java.io.byte_.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {

		FileIOTest f = new FileIOTest();
		//f.test1();
		f.test2();
		System.out.println("-----정상종료-----");
	}
	
	public void test1() {
		String filepath = "test.txt"; //읽어올 파일경로
		String copypath = "byte/test_copy.txt"; //복사붙여넣기할 파일경로
		FileInputStream fis = null; //byte기반 InputStream
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(filepath);
			fos = new FileOutputStream(copypath);
			int data = 0; //읽어온 데이터를 담을 변수
			
			while((data = fis.read()) != -1) {
				//System.out.println(data + " ");
				System.out.println((char)data); //한글은 깨짐(3바이트인데 1바이트만 읽어옴으로)
				fos.write(data); //test를 1바이트씩 읽어와 byte밑에 test_copy에 복사 ->한글안깨짐(3바이트를 1바이트씩 옮긴후 3바이트로 읽기때문에)
				
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //FileNotFoundException과 합칠수있다. IOException이 더 상위클래스이므로 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();//try절에서 선언하면 블럭이 다르기때문에 변수를 못찾는다 -> 밖에서 선언해야한다
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	/* 
	 * 내 컴퓨터의 이미지 파일을 복사해서 byte폴더 하위에 위치시킬것
	 * 경로상의 한글을 피할것
	 * 
	 */
	public void test2() {
		String fileName = "C:\\image\\Main.jpg";
		String copypath = "byte/img_copy.jpg";
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(copypath);
			int data = 0; 
			
			while((data = fis.read()) != -1) {
				fos.write(data); 
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package kh.java.io.char_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileRWTest { //문자기반 -> 텍스트파일제어 한정

	public static void main(String[] args) {

		FileRWTest f = new FileRWTest();
		//f.test1();
		f.test2();
	}

	
	


	/*
	 * 문자기반 스트림 
	 * char 2byte
	 */
	public void test1() {
		//경로상의 실제파일을 가리키는 자바객체(경로상의 실제파일이 없을수있다.만들어냄)
		File f = new File("test.txt");
		FileReader fr = null;
				
		try {		
			fr = new FileReader(f);
			int  data = 0;
			
			while((data = fr.read()) != -1) {
				System.out.print((char)data + ":"); //한글안깨짐(1바이트씩이 아니고 한글자씩 읽어오기때문에)
			}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	/*
	 * 업그레이드ver
	 * try...with...resource 구문(jdk 1.7부터)
	 * 보조스트림을 이용한 처리
	 */
	public void test2() {
		File f = new File("test.txt");
		File dest = new File("char/test_copy.txt");
//		BufferedReader br = null;
//		BufferedWriter bw = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));  //보조스트림과 같이 사용
			BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		
		){ //finally절을통해 close()안해도 됨
			String data = null;
			
			while((data = br.readLine()) != null) {
				System.out.println(data); //라인단위(개행문자전)로 읽어옴
				bw.write(data + "\n");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

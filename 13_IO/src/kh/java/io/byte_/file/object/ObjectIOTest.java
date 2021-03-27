package kh.java.io.byte_.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIOTest {

	public static void main(String[] args) {

		ObjectIOTest o = new ObjectIOTest();
		//o.test1();
		o.test2();
	}
	
	//쓰기
	public void test1(){
		
		File f = new File("object/user.ser"); //object폴더 미리생성
		
		try(
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)))
			//보조스트림을 하나 더 껴서 사용가능(BufferedOutputStream) 보조2 - 보조1 - 주			
		){
			User u1 = new User("hoggd","1234","홍길동",Calendar.getInstance());
			User u2 = new User("sinssa","5678","신사",Calendar.getInstance());
			User u3 = new User("sejomg","8945","세종",Calendar.getInstance());
			//한번에 하나씩 쓴다
			//3개의 객체를 객체배열 하나에 담아 그 배열을 한번에 쓸수있다 
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(u3);
			System.out.println("객체 쓰기 완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	//읽기
	public void test2() {
		
		File f = new File("object/user.ser");
		
		try(
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))
		){
//			User u = (User)ois.readObject(); //ClassNotFoundException 예외처리
//			System.out.println(u);
			System.out.println(ois.readObject()); //쓰여진 객체 수와 동일하게 호출해야한다
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
//			while(true) {
//				System.out.println(ois.readObject()); //객체수를 모를때 반복문을 통해 읽어온후 EOFException이 발생하면 catch에서 처리 -> 몇개인지 확인가능
//			}
			
		} catch (Exception e) { 
			// (IOException | ClassNotFoundException e)
			e.printStackTrace();
		} 
//		catch(EOFException e) {
//			System.out.println("객체 읽기 완료");
//		}
		
		System.out.println("객체 읽기 완료");
	}

}
